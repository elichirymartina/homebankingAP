package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HomeBankingApplication {


    public static void main(String[] args) {
        SpringApplication.run(HomeBankingApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository) {
        return args -> {

            Client client1 = new Client("Melba", "Morel", "melba@mindhub.com");
            clientRepository.save(client1);

            Account account1 = new Account(client1, "123456789", 1000.0);
            accountRepository.save(account1);

            client1.getAccounts().add(account1);
            clientRepository.save(client1);
        };
    }
}