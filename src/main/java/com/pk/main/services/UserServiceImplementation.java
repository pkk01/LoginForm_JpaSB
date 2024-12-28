package com.pk.main.services;

import com.pk.main.entities.User;
import com.pk.main.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean registerUser(User user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//    public boolean loginUser(User user) {
//        try {
//            userRepository.
//        }catch (Exception e) {
//            e.printStackTrace()//            return false;
//        }
//    }
}
