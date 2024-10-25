package com.leohean.my_own_market.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String name;
    private String category;
    private String description;
    private String unitMeasurement;
    private Double stockQuantity;
    private Integer idPhoto;
    private LocalDate creationDate;
    private LocalDate lastUpdateDate;
}
