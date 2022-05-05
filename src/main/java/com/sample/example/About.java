package com.sample.example;

public class About extends ExampleSupport{
    private String websiteDescr = "Alta Sofia Institute is a leading educational institution in the Philippines that serves graduates who are preparing for licensure and / or international certification examinations.    ";
    String[] sentences = {" INNOVATION   ","    EXCELLENCE  ","    COMMITMENT    ", "    LEGACY   ", "    SERVICE   "};
    public String execute(){

        for(int i =1; i<=3; i++){
            setWebsiteDescr(sentence());
        }
        return SUCCESS;
    }

    private String sentence(){
        double index = Math.floor( Math.random() * 5 + 0);         
        String sentence = sentences[(int) index];
        return this.websiteDescr + sentence;
    }

    public String getWebsiteDescr() {
        return websiteDescr;
    }

    public void setWebsiteDescr(String websiteDescr) {
        this.websiteDescr = websiteDescr;
    }

    
    

}