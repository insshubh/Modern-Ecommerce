package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    List<Category> categories = new ArrayList<>();
    private static long id = 1;

    @Override
    public String deleteCategory(Long categoryId) {
        Optional<Category> category = categories.stream()
                .filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst();

        if (category.isEmpty()) {
            return null; // or throw a custom exception
        } else {
            categories.remove(category.get());
            return "Category Deleted with id " + categoryId + " successfully";
        }
    }


    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void save(Category category) {
        if (category.getCategoryId() == null) {
            category.setCategoryId(id);
            id+=1;
        }
    categories.add(category);
    }
}
