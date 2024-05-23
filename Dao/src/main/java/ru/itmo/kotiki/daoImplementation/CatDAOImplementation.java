package ru.itmo.kotiki.daoImplementation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;
import ru.itmo.kotiki.HibernateEntityManagerFactory;
import ru.itmo.kotiki.dao.DAO;
import ru.itmo.kotiki.entity.Cat;

import java.util.ArrayList;

public class CatDAOImplementation implements DAO<Cat> {
    @Override
    public Cat findById(int id) {

        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Cat cat = em.find(Cat.class, id);
        em.getTransaction().commit();
        em.close();
        return cat;

    }

    @Override
    public void save(Cat cat) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(cat);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void update(Cat cat) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.merge(cat);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void delete(Cat cat) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.remove(cat);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public ArrayList<Cat> findAll() {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        ArrayList<Cat> cats = (ArrayList<Cat>) em.createQuery("select * from cats", Cat.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return cats;


    }
}
