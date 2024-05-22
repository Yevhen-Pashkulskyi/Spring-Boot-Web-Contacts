package com.example.app.SpringBootWebContacts.repository;

import com.example.app.SpringBootWebContacts.entity.TopContact;
import com.example.app.SpringBootWebContacts.utils.Constants;
import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;


import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class TopContactRepository {
    private static final Logger LOGGER =
            Logger.getLogger(TopContactRepository.class.getName());
    List<TopContact> topContactList;
    public List<TopContact> getTopContactList() throws IOException {
        File jsonFile = new ClassPathResource(Constants.URL_FILES +
                Constants.FILE_TOP_CONTACT).getFile();
        String path = jsonFile.getAbsolutePath();
        try{
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            topContactList = gson.fromJson(reader, new TypeToken<List<TopContact>>() {}.getType());// не зовсім розумію що тут твориться
            reader.close();
            return topContactList.stream().map(tour -> new TopContact(tour.getId(),
                    Constants.URL_IMAGES + tour.getImg(),tour.getDescription())).toList();
        }catch (IOException e){
            LOGGER.info("TopContactRepository msg" + e.getMessage());
            return Collections.emptyList();
        }
    }
}
