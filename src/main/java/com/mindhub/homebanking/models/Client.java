package com.mindhub.homebanking.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;


@Entity
public class Client {

    @Id
    public String id;
    private String firstName;
    private String lastName;
    private String email;

    public Client() { }

    public Client(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void email(String mail) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public String toString() {
        return firstName + " " + lastName;
    }


}