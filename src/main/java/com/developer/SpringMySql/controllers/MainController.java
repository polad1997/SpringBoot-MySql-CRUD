package com.developer.SpringMySql.controllers;


import com.developer.SpringMySql.models.AppUsers;
import com.developer.SpringMySql.models.AppUsersRepo;
import com.developer.SpringMySql.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MainController {
//    @Autowired
//    MainService mainService;

    @Autowired
    AppUsersRepo appUsersRepo;

//    @RequestMapping("/")
//    public List<AppUsers> getAllUsers() {
//        return mainService.selectAllUsers();
//    }

//    @RequestMapping("/")
//    public ModelAndView firstPage() {
//        return new ModelAndView("login");
//    }

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("lists", appUsersRepo.findAll());  //SELECT FROM DB
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView doUserSave(@RequestParam("id") String id, @RequestParam("firstname") String user_name, @RequestParam("email") String user_email,
                                   @RequestParam("phone") String user_phone, @RequestParam("message") String user_message
    ) {
        ModelAndView mv = new ModelAndView("redirect:/");
        AppUsers appUsers = new AppUsers();
        if (!id.isEmpty()) {
            appUsers = (AppUsers) appUsersRepo.findOne(Integer.parseInt(id));
        } else {
            appUsers = new AppUsers();
        }
        appUsers.setUser_name(user_name);
        appUsers.setUser_email(user_email);
        appUsers.setUser_phone(user_phone);
        appUsers.setUser_message(user_message);
        appUsersRepo.save(appUsers);  //INSERT DATA TO DB
        return mv;
    }

//    @PostMapping("/save")
//    public void saveData(@RequestBody AppUsers appUsers){
//        appUsersRepo.save(appUsers);
//    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists", appUsersRepo.findOne(id));
        return mv;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("redirect:/");
        appUsersRepo.delete(id);
        return mv;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists", appUsersRepo.findOne(id));
        return mv;
    }
}