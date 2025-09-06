package com.ecommerce.project;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SbEcomApplicationTests {
    @Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {
        assertNotNull(categoryService);
    }



}
