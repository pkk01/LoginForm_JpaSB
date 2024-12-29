package com.pk.main.services;

import com.pk.main.entities.User;

public interface UserServices {
    public boolean registerUser (User user);
    public  User loginUser (String email, String password);
}
