package ru.itmo.kotiki;

import ru.itmo.kotiki.dao.DAO;
import ru.itmo.kotiki.daoImplementation.CatDAOImplementation;
import ru.itmo.kotiki.daoImplementation.OwnerDAOImplementation;
import ru.itmo.kotiki.dto.CatDTO;
import ru.itmo.kotiki.entity.Cat;
import ru.itmo.kotiki.entity.Owner;
import ru.itmo.kotiki.enums.Color;

import java.util.Date;

public class Service {

    private final DAO<Cat> catDAO;
    private final DAO<Owner> ownerDAO;

    public Service(CatDAOImplementation catDAO, OwnerDAOImplementation ownerDAO) {
        this.catDAO = catDAO;
        this.ownerDAO = ownerDAO;
    }

    public Service() {
        catDAO = new CatDAOImplementation();
        ownerDAO = new OwnerDAOImplementation();
    }



    public void addOwner(String name, Date birthDate) {
        Owner owner = new Owner();
        owner.setName(name);
        owner.setBirthDate(birthDate);
        ownerDAO.save(owner);
    }


    public void addCat(String name, Date birthDate, String breed, Color color, Owner owner) {
        Cat cat = new Cat();
        cat.setName(name);
        cat.setBirthDate(birthDate);
        cat.setBreed(breed);
        cat.setColor(color);
        cat.setOwner(owner);
        catDAO.save(cat);
        ownerDAO.update(owner);

    }

    public void assignCat(Owner owner, Cat cat) {
        owner.getCats().add(cat);
        cat.setOwner(owner);
        //ownerDAO.update(owner);
        catDAO.update(cat);
    }

    public Cat findCatById (int id) {
        return catDAO.findById(id);
    }

    public Owner findOwnerById (int id) {
        return ownerDAO.findById(id);
    }

    public void befriend(Cat cat1, Cat cat2) {
        cat1.getFriends().add(cat2);
        cat2.getFriends().add(cat1);
        catDAO.update(cat1);
        //catDAO.update(cat2);
    }

    public void deleteCat(Cat cat) {
        Owner owner = cat.getOwner();
        catDAO.delete(cat);
        ownerDAO.update(owner);
    }

    public void deleteOwner(Owner owner) {
        ownerDAO.delete(owner);
    }

  /*  public Cat toDAO(CatDTO catDTO) {
        Cat cat = new Cat();
        cat.setColor(catDTO.getColor());
        cat.setBreed(catDTO.getBreed());
        cat.setName(catDTO.getName());
       // cat.setOwner(catDTO.getOwner());
    }*/






}
