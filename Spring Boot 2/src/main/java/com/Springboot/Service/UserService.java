package com.Springboot.Service;

import com.Springboot.Entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User createUser(User user);
}
