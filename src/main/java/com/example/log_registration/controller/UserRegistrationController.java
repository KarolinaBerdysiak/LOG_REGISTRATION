package com.example.log_registration.controller;

import com.example.log_registration.dto.UserRegistrationDto;
import com.example.log_registration.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();

        // !!!!!!!!! mogę użyć albo zapisu takiego jak wyżej albo do getMapping
       // dodać model.addAttibute jak poniżej. Na jedno wyjdzie
        // @GetMapping
        //    public String showRegistrationForm(Model model){
                // modeladdAttribute("user",new UserRegistationDto())
        //        return "registration";
        //    }
    }


    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

@PostMapping
    String registerUseraccount(@ModelAttribute ("user") UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return "redirect:/registration?succes";
    }
}
