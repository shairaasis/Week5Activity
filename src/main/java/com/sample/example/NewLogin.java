package com.sample.example;
import com.sample.example.Accounts.*;

public class NewLogin extends ExampleSupport {
    private String username = "";
    private String password = "";
    private String pageDescr = "This is the Login Page.";
    String errorMsg ="Account Not Found. Incorrect username and/or password.";
    private Accounts activeAccount;
    Accounts[] accounts = new Accounts[3];

    public String execute() throws Exception {
        accounts[0] = new Accounts("shai", "pass", "Shaira", "Asis", "August 6 1999", "Shaira Asis. Lorem ipsum dolor sit amet. Sit impedit quia At placeat libero aut voluptas galisum rem nobis porro ut nostrum sequi ut sint enim blanditiis doloribus. Ab error nesciunt aut reprehenderit unde qui sint nulla vel reprehenderit temporibus eum fugit facere qui nihil dolorum et quia ipsam.", "admin");
        accounts[1] = new Accounts("jaya", "pass1", "Jaya", "Asis", "August 6 1990", "Jaya Asis. Lorem ipsum dolor sit amet. Sit impedit quia At placeat libero aut voluptas galisum rem nobis porro ut nostrum sequi ut sint enim blanditiis doloribus. Ab error nesciunt aut reprehenderit unde qui sint nulla vel reprehenderit temporibus eum fugit facere qui nihil dolorum et quia ipsam.", "regular");
        accounts[2] = new Accounts("nica", "pass2", "Monica", "Asis", "January 6 2000", "Monica Asis. Lorem ipsum dolor sit amet. Sit impedit quia At placeat libero aut voluptas galisum rem nobis porro ut nostrum sequi ut sint enim blanditiis doloribus. Ab error nesciunt aut reprehenderit unde qui sint nulla vel reprehenderit temporibus eum fugit facere qui nihil dolorum et quia ipsam.", "regular");
        
        setPageDescr(pageDescr + " Input username and password.");
        if (username.length() != 0){
            for (Accounts account : accounts){
                if(username.equals(account.getUsername()) && password.equals(account.getPassword())){
                    setActiveAccount(account);
                    return "successlogin";
                }
            }
            setPageDescr(errorMsg);
        }
        return SUCCESS;
       
    }

    public Accounts getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Accounts activeAccount) {
        this.activeAccount = activeAccount;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Accounts[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts[] accounts) {
        this.accounts = accounts;
    }

    public String getPageDescr() {
        return pageDescr;
    }

    public void setPageDescr(String pageDescr) {
        this.pageDescr = pageDescr;
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
    
    
}
