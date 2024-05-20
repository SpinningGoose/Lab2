package ru.itmo.kotiki;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.itmo.kotiki.entity.Cat;
import ru.itmo.kotiki.entity.Color;
import ru.itmo.kotiki.entity.Owner;

public class HibernateSessionFactory {

    public static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Owner.class);
                configuration.addAnnotatedClass(Cat.class);
                configuration.addAnnotatedClass(Color.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("I don't know what happened but it broke " + e);
            }
        }
        return sessionFactory;
    }
}
