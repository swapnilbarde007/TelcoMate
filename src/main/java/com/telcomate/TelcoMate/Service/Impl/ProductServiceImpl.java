package com.telcomate.TelcoMate.Service.Impl;


import com.telcomate.TelcoMate.Model.Mapper.ProductMapper;
import com.telcomate.TelcoMate.Model.dto.ProductDTO;
import com.telcomate.TelcoMate.Repository.ProductRepo;
import com.telcomate.TelcoMate.Service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void createOrUpdateProduct(ProductDTO productDTO){
        productRepo.creatProduct(new ProductMapper().ProductDTOtoProduct(productDTO));
    }
}
