package com.hackerrank.stereotypes.controller;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // POST: /contact/save
    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        Person saved = contactService.save(person);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // GET: /contact/retrieve/{id}
    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Person> retrieve(@PathVariable Integer id){
        Person person = contactService.retrieve(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}