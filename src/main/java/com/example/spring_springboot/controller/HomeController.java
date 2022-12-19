package com.example.spring_springboot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.example.spring_springboot.model.User;
import com.example.spring_springboot.mydepedencies.MyDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @Autowired
    @Qualifier("myPoliteDependency")
    private MyDependency myDependency;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("Home Page Requested, locale = " + locale);

        String myMessage = myDependency.textPrint();
        model.addAttribute("cokolwiek", myMessage);

        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(User user, Model model) {
        System.out.println("User Page Requested");
        model.addAttribute("userName", user.getUserName());
        return "user";
    }
}