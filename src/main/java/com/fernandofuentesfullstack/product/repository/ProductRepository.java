package com.fernandofuentesfullstack.product.repository;

import com.fernandofuentesfullstack.product.entity.Category;
import com.fernandofuentesfullstack.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);
}
