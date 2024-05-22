package com.example.app.SpringBootWebContacts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopContact {
    private int id; //why dont Integer?
    private String img;
    private String description;
}
