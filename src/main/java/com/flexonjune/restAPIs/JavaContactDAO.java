package com.flexonjune.restAPIs;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JavaContactDAO {

    private ArrayList<JavaContact> tablecontact = new ArrayList<>();

    public JavaContactDAO(){
        tablecontact.add(new JavaContact(1,"Deep","Singh",123456789));
    }

    public ArrayList<JavaContact> getAllContacts(){
        return tablecontact;
    }
}
