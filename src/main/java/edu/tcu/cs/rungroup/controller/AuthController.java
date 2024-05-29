package edu.tcu.cs.rungroup.controller;

import edu.tcu.cs.rungroup.dto.RegistrationDto;
import edu.tcu.cs.rungroup.models.UserEntity;
import edu.tcu.cs.rungroup.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/save")
    public String register(@Valid @ModelAttribute("user") RegistrationDto user,
                           BindingResult bindingResult, Model model) {
        UserEntity existingUserEmail = userService.findByEmail(user.getEmail());
        if (existingUserEmail != null && existingUserEmail.getEmail() != null && !existingUserEmail.getEmail().isEmpty()) {
            bindingResult.rejectValue("email", "There is already a user with this email");
            return "redirect:/register?fail";
        }
        UserEntity existingUserName = userService.findByUserName(user.getUserName());
        if (existingUserName != null && existingUserName.getUsername() != null && !existingUserName.getUsername().isEmpty()){
            bindingResult.rejectValue("username", "There is already a user with this username");
            return "redirect:/register?fail";
        }
        if (bindingResult.hasErrors()){
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/clubs?success";
    }
}
