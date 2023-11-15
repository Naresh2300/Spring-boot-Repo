package com.Springboot.Controller;


import com.Springboot.Entity.Users;
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
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        Users SavedUser = userService.createUser(user);
        return new ResponseEntity<>(SavedUser, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public  ResponseEntity<Users> getUserById(@PathVariable("id") Long userId){
        Users user = userService.getUserId(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
