<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/models/Customer.java
package com.sam.business.ecom.models;
========
package com.sam.business.ecom.model;
>>>>>>>> origin/main:src/main/java/com/sam/business/ecom/model/Customer.java

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "customer", schema = "business_model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
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

    public Customer(String name, String lname, String address, String city, String state, Integer zipcode,
                    String country, String email, String phone) {
<<<<<<<< HEAD:src/main/java/com/sam/business/ecom/models/Customer.java
========
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.email = email;
        this.phone = phone;

>>>>>>>> origin/main:src/main/java/com/sam/business/ecom/model/Customer.java
    }
}
