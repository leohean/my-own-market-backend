package com.leohean.my_own_market.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMarket;
    private String name;
    private String email;
    private String password;
    private String cnpj;
    private Integer idPhoto;
    private LocalDate creationDate;
    private LocalDate lastUpdateDate;
}
