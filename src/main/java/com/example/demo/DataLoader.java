package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws  Exception{
        Message message = new Message("politics","05/20/2019","bush");
        repository.save(message);

        message = new Message("sports","05/22/2019","obama");
        repository.save(message);
        message = new Message("economics","05/23/2019","trump");
        repository.save(message);
    }
}
