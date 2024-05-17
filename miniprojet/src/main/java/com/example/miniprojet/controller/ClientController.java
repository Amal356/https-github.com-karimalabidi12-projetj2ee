package com.example.miniprojet.controller;

import com.example.miniprojet.model.Client;
import com.example.miniprojet.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
    @PostMapping("/clients")
    public String createClient(@ModelAttribute Client client) {
        clientService.saveClient(client); // Supposons que vous ayez une méthode dans votre service pour sauvegarder le client
        return "redirect:/"; // Redirigez l'utilisateur vers une autre page après la création du client
    }

}