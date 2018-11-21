package com.developer.SpringMySql.controllers;


import com.developer.SpringMySql.models.AppUsers;
import com.developer.SpringMySql.services.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<AppUsers> usersList = new ArrayList<>();
//
//    @PostMapping("/save")
//    public ResponseEntity<Object> adduser(@RequestBody AppUsers appUsers){
//        usersList.add(appUsers);
//        ServiceResponse<AppUsers> response = new ServiceResponse<AppUsers>("succes" , appUsers);
//       return new ResponseEntity<Object>(response , HttpStatus.OK);
//    }

}
