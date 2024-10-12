package com.e_Commerce_app_group.e_commerce_dashboard.Services;

import com.e_Commerce_app_group.e_commerce_dashboard.Pojos.CategoryEntity;
import com.e_Commerce_app_group.e_commerce_dashboard.Repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public List<CategoryEntity> getAllcategories(){
        return categoryRepo.findAll();

    }
    public Optional<CategoryEntity> getcategoriesByName(String name){
        try {
            return categoryRepo.findByName(name);
        } catch (Exception e) {

            System.out.println("error in finding the category by name");
            throw new RuntimeException(e);
        }

    }
    public CategoryEntity addCategory(CategoryEntity entry){
        return categoryRepo.save(entry);

    }
    public void deleteCategory(String name){
        categoryRepo.deleteByName(name);


    }

//    public CategoryEntry updateCategory(CategoryEntry entry){
//        return categoryRepo.save(entry);
//
//    }


}
