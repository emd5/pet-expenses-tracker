package com.levibrooke.petexpensestracker.Controller;

import com.levibrooke.petexpensestracker.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class HomeController {

    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/")
    public String getHome(Principal p, Model m) {
        isUserLoggedIn(p, m);
        return "home";
    }

    @GetMapping("/about-us")
    public String getAboutUs(Principal p, Model m) {
        isUserLoggedIn(p, m);
        return "about-us";
    }

    public static void isUserLoggedIn(Principal p, Model m){
        if(p != null){
            m.addAttribute("loggedInName", p.getName());
        }
        else {
            m.addAttribute("loggedInName", false);
        }
    }
}


