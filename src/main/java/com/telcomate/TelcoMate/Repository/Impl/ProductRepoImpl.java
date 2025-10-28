package com.telcomate.TelcoMate.Repository.Impl;

import com.telcomate.TelcoMate.Model.Entity.Product;
import com.telcomate.TelcoMate.Repository.ProductRepo;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepoImpl implements ProductRepo {
    @Override
    public void creatProduct(Product product) {
        System.out.println("Product Saved: "+product);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void getProductById(int productId) {

    }
}
