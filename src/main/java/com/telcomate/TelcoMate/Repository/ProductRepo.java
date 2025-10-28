package com.telcomate.TelcoMate.Repository;

import com.telcomate.TelcoMate.Model.Entity.Product;

public interface ProductRepo {

    void creatProduct(Product product);

    void updateProduct(Product product);

    void getProductById(int productId);
}
