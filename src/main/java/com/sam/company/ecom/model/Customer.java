package com.sam.company.ecom.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "customer", schema = "ecomm_java")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private Integer zipcode;

    @Column(name = "country")
    private String country;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public Customer(String name, String lastName, String address, String address2, String city, Integer zipcode,
                    String country, String email, String phone) {
//        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.email = email;
        this.phone = phone;

    }
}
