package com.Springboot.Service.Impl;

import Repository.UserRepository;
import com.Springboot.Entity.Users;
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
@NoArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

    @Override
    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users getUserId(Long userId) {

         Optional<Users> u1 = userRepository.findById(userId);
         Users u2 = u1.get();
         return u2;
    }
}
