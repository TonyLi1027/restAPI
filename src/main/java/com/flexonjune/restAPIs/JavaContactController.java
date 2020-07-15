package com.flexonjune.restAPIs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JavaContactController {
    @Autowired
    private JavaContactDAO contactDAO = new JavaContactDAO();

    @GetMapping(path="/getAllContacts")
    public ArrayList<JavaContact> getAllContacts(){
        return contactDAO.getAllContacts();
    }

    @RequestMapping(path = "/getAllContacts/{id}")
    public JavaContact getJavaContact(@PathVariable int id){
        return contactDAO.getAllContacts().get(id-1);
    }

    //adding a new student into the classroom
    @PostMapping(path="/addNewContact")
    public ResponseEntity addNewContact (@RequestBody JavaContact newContact){
        contactDAO.addNewContact(newContact);
        return new ResponseEntity<>("Created new contact", HttpStatus.CREATED);
    }

    //update a student in the classroom
    @PutMapping(path="/updateContact/{id}")
    public ResponseEntity updateContact(@RequestBody JavaContact newContact, @PathVariable int id){
        contactDAO.updateContact(newContact,id);
        return new ResponseEntity<>("updated new contact",HttpStatus.CREATED);

    }


}
