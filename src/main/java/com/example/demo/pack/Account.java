package com.example.demo.pack;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
@ToString
public class Account {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "NAME")
    private String firstname;

    @Column(name = "SURNAME")
    private String lastname;

}
