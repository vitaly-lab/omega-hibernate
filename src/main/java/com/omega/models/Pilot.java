package com.omega.models;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "iscertified")
    private String isCertified;
    @Column(name = "email")
    private String email;

    public Pilot() {
    }

    public Pilot(String name, int age, String isCertified, String email) {
        this.name = name;
        this.age = age;
        this.isCertified = isCertified;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isCertified='" + isCertified + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
