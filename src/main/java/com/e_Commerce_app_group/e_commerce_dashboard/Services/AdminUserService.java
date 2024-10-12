package com.e_Commerce_app_group.e_commerce_dashboard.Services;

import com.e_Commerce_app_group.e_commerce_dashboard.Pojos.SignUpEntity;
import com.e_Commerce_app_group.e_commerce_dashboard.Repositories.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminUserService {
    @Autowired
    private SignUpRepo signUpRepo;

    public List<SignUpEntity> getAllUsers(){
        return signUpRepo.findAll();

    }
    public SignUpEntity findUserByEmail(String email){
        return signUpRepo.findByEmail(email);

    }
    public void deleteUser(SignUpEntity user){
        signUpRepo.delete(user);

    }
}
