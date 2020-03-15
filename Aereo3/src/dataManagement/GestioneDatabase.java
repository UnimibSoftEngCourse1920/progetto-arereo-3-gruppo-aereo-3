package dataManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

abstract class GestioneDatabase {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestioneDBGMT");
	static EntityManager entityManagerGMT = factory.createEntityManager(); 
	
	
	static {factory = Persistence.createEntityManagerFactory("GestioneDBCET");}
	static EntityManager entityManagerCET = factory.createEntityManager();			
	
	static void flushAndClear() {
	    entityManagerGMT.flush();
	    entityManagerGMT.clear();
	    entityManagerCET.flush();
	    entityManagerCET.clear();
	}
}
