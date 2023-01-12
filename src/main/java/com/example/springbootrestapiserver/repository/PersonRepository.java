package com.example.springbootrestapiserver.repository;

import com.example.springbootrestapiserver.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    @Query("select case when count(s)>0 then true else false end from Person  s where  s.personId=?1")
    Boolean isPersonExitsById(Integer id);
}
