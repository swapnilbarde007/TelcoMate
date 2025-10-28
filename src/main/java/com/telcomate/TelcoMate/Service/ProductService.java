package com.telcomate.TelcoMate.Service;


import com.telcomate.TelcoMate.Model.Mapper.ProductMapper;
import com.telcomate.TelcoMate.Model.dto.ProductDTO;
import com.telcomate.TelcoMate.Repository.ProductRepo;
import org.springframework.stereotype.Service;


public interface ProductService {
     void createOrUpdateProduct(ProductDTO productDTO);
}
