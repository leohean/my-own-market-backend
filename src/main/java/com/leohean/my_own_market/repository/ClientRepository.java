package com.leohean.my_own_market.repository;

import com.leohean.my_own_market.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
