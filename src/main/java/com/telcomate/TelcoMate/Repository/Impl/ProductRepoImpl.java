package com.telcomate.TelcoMate.Repository.Impl;

import com.telcomate.TelcoMate.Model.Entity.Product;
import com.telcomate.TelcoMate.Repository.ProductRepo;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProductRepoImpl implements ProductRepo {
    boolean testExcFlag=true;

    @Override
    public void creatProduct(Product product) {
        System.out.println("Product Saved: "+product);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public Optional<Product> getProductById(int productId) {
        if(testExcFlag){
            Product p=new Product();
            return Optional.of(p);
        }else{
            return Optional.of(new Product(2,"Wow",39.25D,5.0D));
        }
    }
}
