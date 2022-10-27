package com.nhom12shop.main.service.impl;

import com.nhom12shop.main.entity.Categories;
import com.nhom12shop.main.reposiroty.CategoriesRepo;
import com.nhom12shop.main.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepo categoriesRepo;

    @Override
    public List<Categories> findAll() {
        return categoriesRepo.findByIsDeleted(Boolean.FALSE);
    }
}
