package com.telcomate.TelcoMate.Service.Impl;


import com.telcomate.TelcoMate.Exceptions.ProductNotFoundException;
import com.telcomate.TelcoMate.Model.Entity.Product;
import com.telcomate.TelcoMate.Model.Mapper.ProductMapper;
import com.telcomate.TelcoMate.Model.dto.ProductDTO;
import com.telcomate.TelcoMate.Repository.ProductRepo;
import com.telcomate.TelcoMate.Service.ProductService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void createOrUpdateProduct(ProductDTO productDTO){
        productRepo.creatProduct(new ProductMapper().ProductDTOtoProduct(productDTO));
    }

    @Override
    public ProductDTO getProductById(int productId) {
        Optional<Product> foundProduct=productRepo.getProductById(productId);
        if(foundProduct.isEmpty()){
            throw new ProductNotFoundException("Product with id "+productId+" not found");
        }else{
            return new ProductDTO();
        }
    }
}
