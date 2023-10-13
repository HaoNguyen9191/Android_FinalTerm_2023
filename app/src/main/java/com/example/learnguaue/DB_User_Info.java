package com.example.learnguaue;

public class DB_User_Info {
    private String username;
    private String full_name;
    private String email;
    private String password;

    public DB_User_Info(String username, String full_name, String email, String password)
    {
        this.username=username;
        this.full_name=full_name;
        this.email=email;
        this.password=password;
    }

    public String getUsername() {return this.username;}
    public String getFull_name() {return this.full_name;}
    public String getEmail() {return this.email;}
    public String getPassword() {return this.password;}

    public void setUsername(String username) {this.username = username;}
    public void setFull_name(String full_name) {this.full_name = full_name;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(String password) {this.password = password;}
}
