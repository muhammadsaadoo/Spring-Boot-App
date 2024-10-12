package com.e_Commerce_app_group.e_commerce_dashboard.Services;

import com.e_Commerce_app_group.e_commerce_dashboard.Pojos.SignUpEntity;
import com.e_Commerce_app_group.e_commerce_dashboard.Repositories.SignUpRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SignUpService {
@Autowired
    private SignUpRepo signUpRepo;
    private static final PasswordEncoder passwordencoder=new BCryptPasswordEncoder();

public SignUpEntity insertUser(SignUpEntity newuser){
    try {
        return signUpRepo.save(newuser);
    } catch (Exception e) {
        return null;
    }

}


    public Object insertUser(SignUpEntity newUser, BindingResult result,String role) {
        // Check for validation errors
        try {
            if (result.hasErrors()) {
                // Return validation errors (you can customize this)
                return result.getFieldErrors().stream()
                        .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                        .toList();
            }
            //encrypt password


            // If no validation errors, proceed with saving the user
            newUser.setPassword(passwordencoder.encode(newUser.getPassword()));
            newUser.setRoles(List.of(role));
            SignUpEntity is_add = signUpRepo.save(newUser);

            // You can add custom logic if needed
            if (is_add != null) {
                return is_add;
            } else {
                // Handle the case where the user could not be added
                return "Failed to register user";
            }
        } catch (Exception e) {
            return "Error";
        }
    }



}
