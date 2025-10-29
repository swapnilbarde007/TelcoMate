package com.telcomate.TelcoMate.Repository;

import com.telcomate.TelcoMate.Model.Entity.Product;

import java.util.Optional;

public interface ProductRepo {

    void creatProduct(Product product);

    void updateProduct(Product product);

    Optional<Product> getProductById(int productId);
}
