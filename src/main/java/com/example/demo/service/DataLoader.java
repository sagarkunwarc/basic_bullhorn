package com.example.demo.service;

import com.example.demo.repository.MessageRepository;
import com.example.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Message message = new Message(1L, "politics", "05/20/2019", "bush");
        repository.save(message);

        message = new Message(2L, "sports", "05/22/2019", "obama");
        repository.save(message);

        message = new Message(3L, "economics", "05/23/2019", "trump");
        repository.save(message);
    }
}
