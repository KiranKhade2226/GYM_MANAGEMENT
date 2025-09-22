package com.sk.gymmanagement;

public class User {
    public String name, email;

    public User() { } // Empty constructor for Firebase

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
