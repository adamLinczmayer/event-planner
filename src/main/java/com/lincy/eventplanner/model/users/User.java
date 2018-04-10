package com.lincy.eventplanner.model.users;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick_name")
    private String userName;

    private String email;

    @Column(name = "full_name")
    private String fullName;

    public User() {
    }

    public User(String userName, String email, String fullName) {
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User:" +
                "\nid: " + id +
                ",\nuserName: " + userName +
                ",\nemail: " + email +
                ",\nfullName: " + fullName;
    }
}
