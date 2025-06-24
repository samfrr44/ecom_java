package com.sam.business.ecom.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "product", schema = "business_model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "manufacturer")
    private String manfac;

    @Column(name = "price")
    private Float price;

    @Column(name = "units")
    private Integer units;

    public Product(String name, String manfac, Float price, Integer sock) {
    }

}
