// package com.vunh.Util;
//Your package
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
    private static EntityManagerFactory factory;
    public EntityManager em = getEntityManager();

    public static EntityManager getEntityManager() {
        if (factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory("...");
        }
        return factory.createEntityManager();
    }
  public static void shutdown() {
		if(factory != null || factory.isOpen()) {
			factory.close();
		}
		factory = null;
	}
}
