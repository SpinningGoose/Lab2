package ru.itmo.kotiki.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String name;

}
