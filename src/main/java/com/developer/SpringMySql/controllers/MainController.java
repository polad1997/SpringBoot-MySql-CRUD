package com.developer.SpringMySql.controllers;


import com.developer.SpringMySql.models.AppUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    AppUsersRepo appUsersRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists" , appUsersRepo.findAll());
        return mv;
    }
}