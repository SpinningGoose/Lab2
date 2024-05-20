package ru.itmo.kotiki.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;
    @Column (name = "birth_date")
    Date birthDate;
    @OneToMany (mappedBy = "owner")
    ArrayList<Cat> cats;
}
