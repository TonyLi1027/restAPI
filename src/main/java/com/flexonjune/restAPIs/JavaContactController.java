package com.flexonjune.restAPIs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JavaContactController {
    @Autowired
    private JavaContactDAO contactDAO = new JavaContactDAO();

    @GetMapping(path="/getAllContacts")
    public ArrayList<JavaContact> getAllContacts(){
        return contactDAO.getAllContacts();
    }
}
