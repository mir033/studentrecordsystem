/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentrecordsystem;

/**
 *
 * @author amir
 */
public class Admin {
    private String name;
    private String email;
    private long phone;
    private String password;
    

    /**
     * @return the name
     */
    public Admin(){}
    
    public Admin(String name, String email, String phone, String password){
        super();
        this.name = name;
        this.email = email;
        this.phone = Long.parseLong(phone);
        this.password = password;
        
    }
    public Admin(String name, String email, String password){
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
