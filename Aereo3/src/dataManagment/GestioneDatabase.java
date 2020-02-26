package dataManagment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

abstract class GestioneDatabase {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestioneDB");
	static EntityManager entityManager = factory.createEntityManager();			
	
}
