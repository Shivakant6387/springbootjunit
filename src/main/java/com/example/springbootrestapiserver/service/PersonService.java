package com.example.springbootrestapiserver.service;

import com.example.springbootrestapiserver.entity.Person;
import com.example.springbootrestapiserver.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person>getAllPerson(){
        return this.personRepository.findAll();
    }
}
