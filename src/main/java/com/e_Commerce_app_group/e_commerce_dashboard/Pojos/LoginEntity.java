package com.e_Commerce_app_group.e_commerce_dashboard.Pojos;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;


@Data
public class LoginEntity {


   @NonNull
    private String email;
    @NonNull
    private String password;







}

