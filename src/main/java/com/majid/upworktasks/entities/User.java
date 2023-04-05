package com.majid.upworktasks.entities;

public class User {
    
    private int id;
    private String name;
    private String email;
    private String password;
    private int userRole;
    private String creattionDate;

    public User(){

    }
    
    public User(int id, String name, String email, String password, int userRole, String creattionDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
        this.creattionDate = creattionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getCreattionDate() {
        return creattionDate;
    }

    public void setCreattionDate(String creattionDate) {
        this.creattionDate = creattionDate;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", userRole="
                + userRole + ", creattionDate=" + creattionDate + "]";
    }
        
}
