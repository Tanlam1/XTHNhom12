package com.nhom12shop.main.reposiroty;

import com.nhom12shop.main.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepo extends JpaRepository<Categories, Long> {

	@Query(value = "SELECT * FROM categories WHERE isDeleted = ?", nativeQuery = true)
    List<Categories> findByIsDeleted(Boolean isDeleted);
}
