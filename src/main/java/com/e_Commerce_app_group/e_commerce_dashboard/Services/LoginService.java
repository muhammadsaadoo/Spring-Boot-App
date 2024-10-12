package com.e_Commerce_app_group.e_commerce_dashboard.Services;

import com.e_Commerce_app_group.e_commerce_dashboard.Pojos.SignUpEntity;
import com.e_Commerce_app_group.e_commerce_dashboard.Repositories.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private SignUpRepo signUpRepo;

    public SignUpEntity checkUser(String email){
        try {
            return signUpRepo.findByEmail(email);
        } catch (Exception e) {
            return null;
        }

    }



}
