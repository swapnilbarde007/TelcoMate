package com.telcomate.TelcoMate.Model.Mapper;

import com.telcomate.TelcoMate.Model.Entity.Product;
import com.telcomate.TelcoMate.Model.dto.ProductDTO;

public  class ProductMapper {


    public  Product ProductDTOtoProduct(ProductDTO productDTO){
        return new Product(productDTO.getProductId(), productDTO.getProductName(),productDTO.getProductPrice(),0D);
    }

    public  ProductDTO ProducttoProductDTO(Product product){
        return new ProductDTO(product.getProductId(), product.getProductName(), product.getProductPrice());
    }
}
