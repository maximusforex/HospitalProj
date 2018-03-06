package com.ua.satrumroom.dao.daoimplementations;

import com.ua.satrumroom.domain.Doctor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

    private static SessionFactory sessionFactoryObj;

    protected static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.configurations.xml");

            configuration.addAnnotatedClass(Doctor.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactoryObj = configuration.buildSessionFactory(serviceRegistry);

            return sessionFactoryObj;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactoryObj;
    }

    public static void shutdown(){
        getSessionFactory().close();
    }
}
