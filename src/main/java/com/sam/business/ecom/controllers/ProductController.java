package com.sam.business.ecom.controllers;

import com.sam.business.ecom.dtos.product.ProductRequestDto;
import com.sam.business.ecom.dtos.product.ProductResponseDto;
import com.sam.business.ecom.dtos.product.Product_IdResponseDto;
import com.sam.business.ecom.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")

public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public Product_IdResponseDto create(@RequestBody ProductRequestDto productRequestDTO){
        return productService.createNewProduct(productRequestDTO);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public ProductResponseDto read(@PathVariable("id") String id) {
        return productService.findProductById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ProductResponseDto update(@PathVariable String id, @RequestBody ProductRequestDto request) {
        return productService.updateProduct(id, request);
    }

    @RequestMapping(value = "delete/{id}" , method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("product deleted", HttpStatus.OK);
    }
}
