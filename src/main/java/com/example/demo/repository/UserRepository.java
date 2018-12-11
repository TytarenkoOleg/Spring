package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Person> getUsers() {
        List<Person> personList = new ArrayList<>();
        return personList;
    }
}



