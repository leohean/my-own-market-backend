package com.leohean.my_own_market.repository;

import com.leohean.my_own_market.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Integer> {
}
