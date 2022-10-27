package com.nhom12shop.main.reposiroty;

import com.nhom12shop.main.entity.ProductReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReviewsRepo extends JpaRepository<ProductReviews, Long> {
}
