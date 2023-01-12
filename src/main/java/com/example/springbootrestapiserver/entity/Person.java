package com.example.springbootrestapiserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person_show")
public class Person {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer personId;
    private String personName;
    private String personCity;

}
