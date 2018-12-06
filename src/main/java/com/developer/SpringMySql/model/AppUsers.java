package com.developer.SpringMySql.model;


import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class  AppUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "user_name")
    public String user_name;
    @Column(name = "user_email")
    public String user_email;
    @Column(name = "user_phone")
    public String user_phone;
    @Column(name = "user_message")
    public String user_message;

    public AppUsers() {

    }

    public AppUsers(int id, String user_name, String user_email, String user_phone, String user_message) {
        super();
        this.id = id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_message = user_message;
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

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_message() {
        return user_message;
    }

    public void setUser_message(String user_message) {
        this.user_message = user_message;
    }
}
