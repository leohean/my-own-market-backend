package com.leohean.my_own_market.service;

import com.leohean.my_own_market.model.Client;
import com.leohean.my_own_market.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public Client getClientById(Integer idClient){
        Optional<Client> optionalClient = clientRepository.findById(idClient);

        if(optionalClient.isPresent())
            return optionalClient.get();
        else
            return null;
    }

    public Client saveClient(Client client){
        Client savedClient = clientRepository.save(client);
        return client;
    }

    public Client updateClient(Client client){
        Optional<Client> optionalClient = clientRepository.findById(client.getIdClient());

        if(optionalClient.isPresent()){
            Client updatedClient = clientRepository.save(client);
            return updatedClient;
        }else{
            return null;
        }
    }

    public void deleteClientById(Integer idClient){
        clientRepository.deleteById(idClient);
    }
}
