package ru.itmo.kotiki.dao;

import java.util.ArrayList;

public interface DAO<T> {

    T findById (int id);

    void save (T t);

    void update (T t);

    void delete (T t);

    ArrayList<T> findAll();

}
