package com.unir.actividad1.service;

import com.unir.actividad1.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<Client> getAllClients();

    public Optional<Client> getClientById(Integer id);

    public List<Client> getClientsByName(String name);

    public Client saveClient(Client client);

    public void deleteClient(Integer id);

}
