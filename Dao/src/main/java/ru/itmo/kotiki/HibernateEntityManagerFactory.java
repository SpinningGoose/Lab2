package ru.itmo.kotiki;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateEntityManagerFactory {
    public static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            try {
                entityManagerFactory = Persistence.createEntityManagerFactory("pu");
            } catch (Exception e) {
                System.out.println("I don't know what happened but it broke" + e);
            }
        }
        return entityManagerFactory;
    }
}
