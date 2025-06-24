package com.sam.business.ecom.translators;

import com.sam.business.ecom.dtos.product.ProductRequestDto;
import com.sam.business.ecom.dtos.product.ProductResponseDto;
import com.sam.business.ecom.dtos.product.Product_IdResponseDto;
import com.sam.business.ecom.models.Product;
import org.springframework.stereotype.Component;


@Component
public class ProductTranslator {

    public Product toEntity(ProductRequestDto dto){
        return new Product(dto.getName(), dto.getManfac(), dto.getPrice(),
                dto.getUnits());
    }

    public ProductResponseDto toDTO(Product entity){
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setManfac(entity.getManfac());
        dto.setPrice(entity.getPrice());
        dto.setUnits(entity.getUnits());
        return dto;
    }

    public Product_IdResponseDto toDTO_ID(Product entity) {
        return Product_IdResponseDto.builder()
                .id(entity.getId())
                .build();
    }


}
