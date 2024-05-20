package ru.itmo.kotiki.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table (name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "birth_date")
    Date bithDate;
    @Column
    String name;
    @Column
    String breed;
    @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "color_id")
    Color color;
    @ManyToOne
            @JoinColumn(name = "owner_id")
    Owner owner;
    @ManyToMany
    @JoinTable(name = "friends",
            joinColumns = @JoinColumn(name = "first_cat_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "second_cat_id", referencedColumnName = "id"))
    ArrayList<Cat> friends;

    public Cat(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Cat> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Cat> friends) {
        this.friends = friends;
    }
}
