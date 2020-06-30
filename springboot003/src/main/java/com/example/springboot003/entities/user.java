package com.example.springboot003.entities;

public class user {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
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
