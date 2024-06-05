package com.unir.actividad1.service.impl;

import com.unir.actividad1.entity.Client;
import com.unir.actividad1.repository.ClientRepository;
import com.unir.actividad1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> getClientsByName(String name) {
        return clientRepository.findByName(name);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}
