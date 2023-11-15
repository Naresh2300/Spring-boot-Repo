package com.Springboot.Service.Impl;

import Repository.UserRepository;
import com.Springboot.Entity.User;
import com.Springboot.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
//@AllArgsConstructor
//public class UserServiceImpl implements UserService {
//
//    private UserRepository userRepository;
//    @Override
//    public User createUser(User user) {
//
//        return userRepository.save(user);
//    }



@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserId(Long userId) {

         Optional<User> optionalUser =userRepository.findById(userId);
        return optionalUser.get() ;
    }
}
