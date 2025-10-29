package com.telcomate.TelcoMate.Controller;


import com.telcomate.TelcoMate.Model.dto.ProductDTO;
import com.telcomate.TelcoMate.Service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/products",produces = (MediaType.APPLICATION_JSON_VALUE))
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/creatNewProduct")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        productService.createOrUpdateProduct(productDTO);
        return ResponseEntity.status(200)
                .body(productDTO);
    }

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable int productId){
        productService.getProductById(productId);
    }
}



