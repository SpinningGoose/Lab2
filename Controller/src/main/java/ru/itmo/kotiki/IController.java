package ru.itmo.kotiki;

import ru.itmo.kotiki.dto.CatDTO;
import ru.itmo.kotiki.dto.OwnerDTO;
import ru.itmo.kotiki.entity.Cat;
import ru.itmo.kotiki.entity.Owner;
import ru.itmo.kotiki.enums.Color;

import java.util.Date;

public interface IController {
    public void addCat(String name, String breed, Date birthDate, Color color, Owner owner);
    public void addOwner(String name, Date birthDate);
    public void assignCat(Owner owner, Cat cat);
    public void befriend(Cat cat1, Cat cat2);
    public Cat findCatById(int id);
    public Owner findOwnerById(int id);
    public void deleteCatById(int id);
    public void deleteOwnerById(int id);

}
