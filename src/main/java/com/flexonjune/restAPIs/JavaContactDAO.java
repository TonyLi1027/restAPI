package com.flexonjune.restAPIs;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JavaContactDAO {

    private ArrayList<JavaContact> tablecontact = new ArrayList<>();

    public JavaContactDAO(){

        tablecontact.add(new JavaContact(1,"Deep","Singh",123456789));
        tablecontact.add(new JavaContact(2,"Dongshuo","Li", 783123213));
        tablecontact.add(new JavaContact(3,"Liang","Wang",323243243));
        tablecontact.add(new JavaContact(4,"Shun", "Zeng", 234331234));
    }

    public ArrayList<JavaContact> getAllContacts(){
        return tablecontact;
    }

    public JavaContact getContact(int ID){
        return tablecontact.get(ID);
    }

    public JavaContact addNewContact(JavaContact newContact){
        tablecontact.add(newContact);
        return newContact;
    }

    public JavaContact updateContact(JavaContact newContact, int ID){
        tablecontact.set(ID-1, newContact);
        return tablecontact.get(ID-1);
    }

    public void deleteContact(int id){
        tablecontact.remove(id);
    }
}
