package com.nhom12shop.main.reposiroty;

import com.nhom12shop.main.entity.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImagesRepo extends JpaRepository<ProductImages, Long> {
}
