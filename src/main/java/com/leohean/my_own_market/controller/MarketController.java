package com.leohean.my_own_market.controller;

import com.leohean.my_own_market.model.Market;
import com.leohean.my_own_market.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketService marketService;

    @GetMapping("/")
    public ResponseEntity<List<Market>> getAllMarkets(){
        return ResponseEntity.ok().body(marketService.getAllMarkets());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Market> getMarketById(@PathVariable Integer idMarket){
        return ResponseEntity.ok().body(marketService.getMarketById(idMarket));
    }

    @PostMapping("/")
    public ResponseEntity<Market> saveMarket(@RequestBody Market market){
        return ResponseEntity.ok().body(marketService.saveMarket(market));
    }

    @PutMapping("/")
    public ResponseEntity<Market> updateMarket(@RequestBody Market market){
        return ResponseEntity.ok().body(marketService.updateMarket(market));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMarket(@PathVariable Integer idMarket){
        marketService.deleteById(idMarket);
        return ResponseEntity.ok().body("Market was deleted sucessfully");
    }
}
