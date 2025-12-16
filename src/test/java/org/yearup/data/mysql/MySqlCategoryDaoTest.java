package org.yearup.data.mysql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.yearup.models.Category;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles ("test")
class MySqlCategoryDaoTest {

    @Autowired
    private  MySqlCategoryDao categoryDao;


   @Test
    void create() {
       Category category = new Category();
       category.setName("JUnit Test Category");
       category.setDescription("Created from unit test");

       Category saved = categoryDao.create(category);

       assertNotNull(saved);
       assertTrue(saved.getCategoryId() > 0);


    }
}