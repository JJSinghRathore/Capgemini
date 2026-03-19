package com.hackerrank.stereotypes.service;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    // Constructor Injection
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Person retrieve(Integer id){
        return contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }

    public Person save(Person person){
        return contactRepository.save(person);
    }
}