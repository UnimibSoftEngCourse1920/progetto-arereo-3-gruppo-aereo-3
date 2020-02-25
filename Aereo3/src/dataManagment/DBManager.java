package dataManagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.cfg.Configuration;

import dominio.*;



public class DBManager {


	
	public static Configuration getHibernateConfiguration() {
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure().addAnnotatedClass(Cliente.class).addAnnotatedClass(ClienteFedele.class).addAnnotatedClass(Posto.class).addAnnotatedClass(Prenotazione.class).addAnnotatedClass(Promozione.class).addAnnotatedClass(Volo.class);
		
		return configuration;
	}
//public static Configuration getHibernateConfigurationTestRow() {
//		
//		Configuration configuration = new Configuration();
//		configuration = configuration.configure().addAnnotatedClass(TestRow.class);
//		
//		return configuration;
//	}


}
