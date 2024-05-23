package ru.itmo.kotiki;

import ru.itmo.kotiki.dto.CatDTO;
import ru.itmo.kotiki.dto.OwnerDTO;
import ru.itmo.kotiki.entity.Cat;
import ru.itmo.kotiki.entity.Owner;
import ru.itmo.kotiki.enums.Color;

import java.util.Date;

public class Controller implements IController {

    Service service;

    public Controller() {
        service = new Service();
    }


    @Override
    public void addCat(String name, String breed, Date birthDate, Color color, Owner owner) {
        service.addCat(name, birthDate, breed, color, owner);
    }

    @Override
    public void addOwner(String name, Date birthDate) {
        service.addOwner(name, birthDate);

    }

    @Override
    public void assignCat(Owner owner, Cat cat) {
        service.assignCat(owner, cat);

    }

    @Override
    public void befriend(Cat cat1, Cat cat2) {
        service.befriend(cat1, cat2);

    }

    @Override
    public Cat findCatById(int id) {
        return service.findCatById(id);
    }

    @Override
    public Owner findOwnerById(int id) {
        return service.findOwnerById(id);
    }

    @Override
    public void deleteCatById(int id) {
        service.deleteCat(findCatById(id));

    }

    @Override
    public void deleteOwnerById(int id) {
        service.deleteOwner(findOwnerById(id));

    }
}
