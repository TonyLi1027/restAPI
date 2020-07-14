package com.flexonjune.restAPIs;

public class JavaContact {
    private int contactID;
    private String name;
    private String lastname;
    private int phoneNumber;

    public JavaContact(int contactID, String name, String lastname, int phoneNumber){
        super();
        this.contactID = contactID;
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public int getContactID(){
        return contactID;
    }

    public void setContactID(int studentID){
        this.contactID = studentID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "JavaContact [contactID=" + contactID + ", name=" + name + ", lastname=" + lastname + ", phoneNumber="
                + phoneNumber + "]";
    }
}

