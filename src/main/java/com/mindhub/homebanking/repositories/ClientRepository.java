package com.mindhub.homebanking.repositories;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class ClientRepository {

    public static void main(String[] args) {SpringApplication.run(ClientRepository.class, args); }

    @Bean
    public CommandLineRunner initData(ClientRepository clientRepository){
        return (args -> {
            Client client1 = new Client();

            client1.setFirstName("Carlos");
            client1.setLastName("Almada");
            client1.email("carlos.almada01@gmail.com");
        });
    }

}
