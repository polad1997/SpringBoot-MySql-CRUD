package com.developer.SpringMySql.services;

import com.developer.SpringMySql.models.AppUsers;
import com.developer.SpringMySql.models.AppUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {

    @Autowired
    private AppUsersRepo appUsersRepo;

    public List<AppUsers> selectAllUsers(){
        List<AppUsers> users = new ArrayList<>();
        appUsersRepo.findAll().forEach(users :: add);
        return users;
    }

}
