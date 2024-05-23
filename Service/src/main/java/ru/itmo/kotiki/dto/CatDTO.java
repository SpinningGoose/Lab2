package ru.itmo.kotiki.dto;

import jakarta.persistence.*;
import ru.itmo.kotiki.entity.Cat;
import ru.itmo.kotiki.entity.Owner;
import ru.itmo.kotiki.enums.Color;

import java.util.ArrayList;
import java.util.Date;

public class CatDTO {

    int id;

    Date birthDate;

    String name;

    String breed;

    Color color;

    OwnerDTO owner;
    ArrayList<CatDTO> friends;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public OwnerDTO getOwner() {
        return owner;
    }

    public void setOwner(OwnerDTO owner) {
        this.owner = owner;
    }

    public ArrayList<CatDTO> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<CatDTO> friends) {
        this.friends = friends;
    }


}
