package com.sam.business.ecom.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "customer", schema = "business_model")
@Getter
@Setter
@Builder
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
    private String lname;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private Integer zipcode;

    @Column(name = "country")
    private String country;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public Customer(String name, String lname, String address, String state, String city, Integer zipcode,
                    String country, String email, String phone) {
        this.name = name;
        this.lname = lname;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.email = email;
        this.phone = phone;

    }
}
