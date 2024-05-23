package com.example.app.SpringBootWebContacts.service;

import com.example.app.SpringBootWebContacts.entity.Manager;
import com.example.app.SpringBootWebContacts.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;
    public List<Manager> getManager() throws URISyntaxException, IOException {
        return managerRepository.getManagerList();
    }
}
