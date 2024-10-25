package com.leohean.my_own_market.controller;

import com.leohean.my_own_market.model.Client;
import com.leohean.my_own_market.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok().body(clientService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id){
        return ResponseEntity.ok().body(clientService.getClientById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return ResponseEntity.ok().body(clientService.saveClient(client));
    }

    @PutMapping("/")
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        return ResponseEntity.ok().body(clientService.updateClient(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> saveClient(@PathVariable Integer id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok().body("Client was deleted sucessfully");
    }

}
