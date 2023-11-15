package com.Springboot.Service;

import com.Springboot.Entity.Users;
import org.springframework.stereotype.Service;


public interface UserService {

    Users createUser(Users user);

    Users getUserId(Long userId);


}
