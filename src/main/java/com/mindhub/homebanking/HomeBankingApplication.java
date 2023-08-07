package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class HomeBankingApplication {


    public static void main(String[] args) {
        SpringApplication.run(HomeBankingApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClientRepository clientRepository) {
        return args -> {
            Client client1 = new Client();
            client1.setFirstName("Morel");
            client1.setLastName("Morel");
            client1.setEmail("melba@mindhub.com");
            

            clientRepository.save(client1);
        };
    }
}