package com.sam.business.ecom.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "order", schema = "business_model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private UUID customer_id;

    @Column
    private UUID product_id;

    @Column(name="quantity")
    private Integer quant;

    @Column
    private String date;

    public Order(UUID customer, UUID order, Integer quant, String date) {
    }
}
