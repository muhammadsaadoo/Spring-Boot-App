package com.e_Commerce_app_group.e_commerce_dashboard.Repositories;

import com.e_Commerce_app_group.e_commerce_dashboard.Pojos.SignUpEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SignUpRepo extends MongoRepository<SignUpEntity, ObjectId> {
    SignUpEntity findByEmail(String email);


}
