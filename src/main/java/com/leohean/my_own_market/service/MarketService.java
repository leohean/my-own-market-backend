package com.leohean.my_own_market.service;

import com.leohean.my_own_market.model.Market;
import com.leohean.my_own_market.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketService {

    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarkets(){ return marketRepository.findAll(); }

    public Market getMarketById(Integer idMarket){
        Optional<Market> optionalMarket = marketRepository.findById(idMarket);

        if(optionalMarket.isPresent()){
            return optionalMarket.get();
        }else {
            return null;
        }
    }

    public Market saveMarket(Market market){
        Market savedMarket = marketRepository.save(market);
        return savedMarket;
    }

    public Market updateMarket(Market market){
        Optional<Market> optionalMarket = marketRepository.findById(market.getIdMarket());

        if(optionalMarket.isPresent()){
            Market updatedMarket = marketRepository.save(market);
            return updatedMarket;
        }else{
            return null;
        }
    }

    public void deleteById(Integer idMarket){ marketRepository.deleteById(idMarket);}
}
