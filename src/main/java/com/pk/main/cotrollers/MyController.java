package com.pk.main.cotrollers;

import com.pk.main.entities.User;
import com.pk.main.services.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @Autowired
    private UserServiceImplementation userService;

    @GetMapping("/regPage")
    public String openRegPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/regForm")
    public String submitRegForm(@ModelAttribute("user") User user, Model model) {

        boolean status = userService.registerUser(user);
        if (status) {
            model.addAttribute("successMsg", "User registered successfully");
        } else {
            model.addAttribute("errorMsg", "User registration failed");
        }
        return "register";
    }

    @GetMapping("/loginPage")
    public String openLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/loginForm")
    public String submitLoginForm (@ModelAttribute ("user") User user, Model model) {
        User validUser = userService.loginUser(user.getEmail(),user.getPassword());
        if (validUser != null) {
            model.addAttribute("modelName", validUser.getName());
            return "profile";
        } else {
            model.addAttribute("errorMsg", "Invalid email or password");
            return "login";
        }
    }
}
