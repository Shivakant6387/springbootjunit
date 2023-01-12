package com.example.springbootrestapiserver.repository;

import com.example.springbootrestapiserver.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void isPersonExitsById() {

        Person person=new Person(1,"shiva","Kharela" );
        personRepository.save(person);
       // System.out.println( personRepository.findAll());
        Boolean actualResult=personRepository.isPersonExitsById(1);
        assertThat(actualResult).isTrue();
    }
}