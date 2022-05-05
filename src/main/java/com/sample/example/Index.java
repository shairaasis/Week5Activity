package com.sample.example;

public class Index extends ExampleSupport{

    String[] sentences = {" INNOVATION   ","    EXCELLENCE  ","    COMMITMENT    ", "    LEGACY   ", "    SERVICE   "};
    public String execute(){

        for(int i =1; i<=3; i++){
            setWebsiteDescr(sentence());
        }
        return SUCCESS;
    }

/*private String descAdditional(){
        String sentence = sentence();
        return sentence;
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