package com.ra.session13.module.dao.category;

import com.ra.session13.module.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> findAll();
    Boolean create(Category category);
    Category findById(int id);
    Boolean update(Category category);
    void  delete(int id);
}
