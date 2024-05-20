package ru.itmo.kotiki.daoImplementation;

import ru.itmo.kotiki.dao.DAO;
import ru.itmo.kotiki.entity.Cat;

import java.util.ArrayList;

public class CatDAOImplementation implements DAO<Cat> {
    @Override
    public Cat findById(int id) {
        return null;
    }

    @Override
    public void save(Cat cat) {

    }

    @Override
    public void update(Cat cat) {

    }

    @Override
    public void delete(Cat cat) {

    }

    @Override
    public ArrayList<Cat> findAll() {
        return null;
    }
}
