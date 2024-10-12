package com.e_Commerce_app_group.e_commerce_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
// PlatformTransactionManager Interface  do all the transaction functions
//MongoTransactionManager is the implementatoon of  PlatformTransactionManager
public class ECommerceDashboardApplication {

	public static void main(String[] args) {

		SpringApplication.run(ECommerceDashboardApplication.class, args);
	}


}
