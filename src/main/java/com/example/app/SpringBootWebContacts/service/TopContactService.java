package com.example.app.SpringBootWebContacts.service;

import com.example.app.SpringBootWebContacts.entity.TopContact;
import com.example.app.SpringBootWebContacts.repository.TopContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class TopContactService {
    @Autowired
    TopContactRepository topContactRepository;
    public List<TopContact> getTopContacts() throws URISyntaxException, IOException {
        return topContactRepository.getTopContactList();
    }
}
