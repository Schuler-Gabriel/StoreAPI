package com.schuler.storeAPI.service;

import com.schuler.storeAPI.domain.Client;
import com.schuler.storeAPI.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repo;

    public Client find(Integer id){
        Optional<Client> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
