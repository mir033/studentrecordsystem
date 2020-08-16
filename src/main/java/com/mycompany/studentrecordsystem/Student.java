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
public class Student {

    private String name;
    private int matricno;
    private String currentaddress;
    private String homeaddress;
    private String email;
    private long mobileno;
    private long phoneno;
   public Student(){}
    public Student (String name, int matricno, String currentaddress,
            String homeaddress, String email, long mobileno, long phoneno){
    this.name = name;
    this.matricno = matricno;
    this.currentaddress = currentaddress;
    this.homeaddress = homeaddress;
    this.email = email;
    this.mobileno = mobileno;
    this.phoneno = phoneno;
    
    }
    /**
     * @return the name
     */
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
     * @return the matricno
     */
    public int getMatricno() {
        return matricno;
    }

    /**
     * @param matricno the matricno to set
     */
    public void setMatricno(int matricno) {
        this.matricno = matricno;
    }

    /**
     * @return the currentaddress
     */
    public String getCurrentaddress() {
        return currentaddress;
    }

    /**
     * @param currentaddress the currentaddress to set
     */
    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    /**
     * @return the homeaddress
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
     * @param homeaddress the homeaddress to set
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobileno
     */
    public long getMobileno() {
        return mobileno;
    }

    /**
     * @param mobileno the mobileno to set
     */
    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * @return the phoneno
     */
    public long getPhoneno() {
        return phoneno;
    }

    /**
     * @param phoneno the phoneno to set
     */
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

}
