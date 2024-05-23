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
    @OneToMany (mappedBy = "owner", cascade = CascadeType.PERSIST)
    ArrayList<Cat> cats;

    public Owner(String name, Date birthDate, ArrayList<Cat> cats) {
        this.name = name;
        this.birthDate = birthDate;
        this.cats = cats;
    }

    public Owner() {
        cats = new ArrayList<Cat>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
