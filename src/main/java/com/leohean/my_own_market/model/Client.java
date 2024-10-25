package com.leohean.my_own_market.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String name;
    private String email;
    private String password;
    private LocalDate birth;
    private String Cpf;
    private Integer idPhoto;
    private LocalDate creationDate;
    private LocalDate lastUpdateDate;
}
