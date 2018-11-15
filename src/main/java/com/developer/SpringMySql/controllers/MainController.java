package com.developer.SpringMySql.controllers;


import com.developer.SpringMySql.models.AppUsers;
import com.developer.SpringMySql.models.AppUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    AppUsersRepo appUsersRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", appUsersRepo.findAll());  //SELECT FROM DB
        return mv;
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ModelAndView doUserSave(@RequestParam("firstname") String user_name, @RequestParam("lastname") String user_surname) {
        ModelAndView mv = new ModelAndView("redirect:/");
        AppUsers appUsers = new AppUsers();
        appUsers.setUser_name(user_name);
        appUsers.setUser_surname(user_surname);
        appUsersRepo.save(appUsers);  //INSERT DATA TO DB
        return mv;
    }

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",appUsersRepo.findOne(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        appUsersRepo.delete(id);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",appUsersRepo.findOne(id));
        return mv;
    }
}