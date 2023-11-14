package com.Springboot.Controller;


import com.Springboot.Entity.User;
import com.Springboot.Service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;




    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User SavedUser = userService.createUser(user);
        return new ResponseEntity<>(SavedUser, HttpStatus.CREATED);

    }
}
