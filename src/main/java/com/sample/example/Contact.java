package com.sample.example;

public class Contact extends ExampleSupport{
    /*String username[] = {"shai", "jaya", "nica"};
    String password[] = {"asis1", "asis2", "asis3"};*/
    String[] sentences = {" INNOVATION   ","    EXCELLENCE  ","    COMMITMENT    ", "    LEGACY   ", "    SERVICE   "};
    public String execute(){

        for(int i =1; i<=3; i++){
            setWebsiteDescr(sentence());
        }
        

        
        /*if(username.equals(username) && password.equals(password)){
            return "success";
        }  
        else if(username.equals(username) || password.equals(password)){ 
            return "error";
        }
        else{
            return SUCCESS;
        }
        */

        return SUCCESS;
        
    }

    /*
    public String[] getUsername() {
        return username;
    }


    public void setUsername(String[] username) {
        this.username = username;
    }


    public String[] getPassword() {
        return password;
    }


    public void setPassword(String[] password) {
        this.password = password;
    }*/


    private String sentence(){
        double index = Math.floor( Math.random() * 5 + 0);         
        String sentence = sentences[(int) index];
        return this.websiteDescr + sentence;
    }
    private String websiteDescr = "Alta Sofia Institute is a leading educational institution in the Philippines that serves graduates who are preparing for licensure and / or international certification examinations.    ";
    public String getWebsiteDescr() {
        return websiteDescr;
    }

    public void setWebsiteDescr(String websiteDescr) {
        this.websiteDescr = websiteDescr;
    }

    
}