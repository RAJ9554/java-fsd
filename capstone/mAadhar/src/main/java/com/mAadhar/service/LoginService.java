package com.mAadhar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mAadhar.bean.Login;
import com.mAadhar.repository.LoginRepository;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public String signIn(Login login) {
        Optional<Login> result = loginRepository.findById(login.getEmailid());
        if (result.isPresent()) {
            Login ll = result.get();
            if (ll.getPassword().equals(login.getPassword())) {
                if (login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("admin")) {
                    return "Admin successfully login";
                } else if (login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("user")) {
                    return "User successfully login";
                } else {
                    return "Invalid details";
                }
            } else {
                return "Invalid password";
            }
        } else {
            return "Invalid emailId";
        }
    }

    public String signUp(Login login) {
        Optional<Login> result = loginRepository.findById(login.getEmailid());
        if (result.isPresent()) {
            return "Email Id already exists";
        } else {
            if (login.getTypeOfUser().equals("admin")) {
                // Creating a new admin user
                loginRepository.save(login);
                return "Admin account created successfully";
            } else {
                loginRepository.save(login);
                return "User account created successfully";
            }
        }
    }
}
