package com.sample.example.Accounts;

public class Accounts {
    private String username, password, firstname, lastname, bday, bio, type;

    public Accounts(String username, String password, String firstname, String lastname, String bday, String bio, String type){
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.bday = bday;
        this.bio = bio;
        this.type = type;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getBday() {
        return bday;
    }
    public void setBday(String bday) {
        this.bday = bday;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    
}
