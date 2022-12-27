package com.hillel.pashchenko.lesson31.util;

import com.hillel.pashchenko.lesson31.entity.Account;
import com.hillel.pashchenko.lesson31.entity.Client;
import com.hillel.pashchenko.lesson31.entity.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateConfig {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Properties properties = new Properties();
                Configuration configuration = new Configuration().addProperties(properties);
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Status.class);
                configuration.addAnnotatedClass(Account.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }

}
