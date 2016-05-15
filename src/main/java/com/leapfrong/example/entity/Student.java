/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrong.example.entity;

/**
 *
 * @author Nirajan
 */
public class Student {
    
    private int id;
    private String name, email, contact ;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, String email, String contact, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.status = status;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", status=" + status + '}';
    }
    
    
}
