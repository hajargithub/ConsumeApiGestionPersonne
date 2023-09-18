package com.codingTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codingTech.entity.Personne;

@Service
public class PersonApiService {

	
    private  RestTemplate restTemplate=new RestTemplate();


    public List<Personne> getPersonnes() {
        String apiUrl = "http://localhost:8015/api/personnes" ; 
        // Replace with the actual API URL

        // Make the GET request and parse the response into a PersonInfo object
        
        List<Personne> liste=restTemplate.getForObject(apiUrl,List.class);
        return liste;
    }

}
