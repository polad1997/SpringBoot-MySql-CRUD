package com.developer.SpringMySql.models;


import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class AppUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "user_name")
    public String user_name;
    @Column(name = "user_surname")
    public String user_surname;


    public AppUsers() {

    }

    public AppUsers(String user_name, String user_surname) {
        this.user_name = user_name;
        this.user_surname = user_surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }
}
