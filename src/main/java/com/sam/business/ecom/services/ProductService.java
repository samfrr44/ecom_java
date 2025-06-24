package com.sam.business.ecom.services;

import com.sam.business.ecom.dtos.product.ProductRequestDto;
import com.sam.business.ecom.dtos.product.ProductResponseDto;
import com.sam.business.ecom.dtos.product.Product_IdResponseDto;
import com.sam.business.ecom.models.Product;
import com.sam.business.ecom.repositories.ProductRepository;
import com.sam.business.ecom.translators.ProductTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductTranslator translator;

    public Product_IdResponseDto createNewProduct (ProductRequestDto productRequestDTO){

        Product new_product = productRepository.save(Product.builder()
                .name(productRequestDTO.getName())
                .manfac(productRequestDTO.getManfac())
                .price(productRequestDTO.getPrice())
                .units(productRequestDTO.getUnits())
                .build()
        );

        return translator.toDTO_ID(new_product);
    }

    public ProductResponseDto findProductById(String id){

        Product product = productRepository.findById(UUID.fromString(id)).get();

        return translator.toDTO(product);
    }

    public ProductResponseDto updateProduct(String id, ProductRequestDto dto) {

        Product product = productRepository.findById(UUID.fromString(id)).get();
        if (dto.getName() != null) product.setName(dto.getName());
        if (dto.getManfac() != null) product.setManfac(dto.getManfac());
        if (dto.getPrice() != null) product.setPrice(dto.getPrice());
        if (dto.getUnits() != null) product.setUnits(dto.getUnits());

        return translator.toDTO(productRepository.save(product));
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

}
