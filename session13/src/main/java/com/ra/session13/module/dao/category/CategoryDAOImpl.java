package com.ra.session13.module.dao.category;

import com.ra.session13.module.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public Boolean create(Category category) {
        return null;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public Boolean update(Category category) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
