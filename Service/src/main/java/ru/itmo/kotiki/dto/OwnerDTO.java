package ru.itmo.kotiki.dto;

import jakarta.persistence.*;
import ru.itmo.kotiki.entity.Cat;

import java.util.ArrayList;
import java.util.Date;

public class OwnerDTO {


    int id;

    String name;

    Date birthDate;

    ArrayList<CatDTO> cats;

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

    public ArrayList<CatDTO> getCats() {
        return cats;
    }

    public void setCats(ArrayList<CatDTO> cats) {
        this.cats = cats;
    }
}
