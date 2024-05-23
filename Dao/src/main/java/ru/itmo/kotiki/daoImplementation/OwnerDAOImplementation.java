package ru.itmo.kotiki.daoImplementation;

import jakarta.persistence.EntityManager;
import ru.itmo.kotiki.HibernateEntityManagerFactory;
import ru.itmo.kotiki.dao.DAO;
import ru.itmo.kotiki.entity.Owner;

import java.util.ArrayList;

public class OwnerDAOImplementation implements DAO<Owner> {
    @Override
    public Owner findById(int id) {

        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        Owner owner = em.find(Owner.class, id);
        em.getTransaction().commit();
        em.close();
        return owner;
    }

    @Override
    public void save(Owner owner) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(owner);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void update(Owner owner) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.merge(owner);
        em.getTransaction().commit();
        em.close();


    }

    @Override
    public void delete(Owner owner) {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.remove(owner);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public ArrayList<Owner> findAll() {
        EntityManager em = HibernateEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        ArrayList<Owner> owners = (ArrayList<Owner>) em.createQuery("select * from owners", Owner.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return owners;
    }
}
