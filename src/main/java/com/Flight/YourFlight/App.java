package com.Flight.YourFlight;




import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
	    System.out.println("Hello World!");

//	    Configuration cfg = new Configuration();
//	    cfg.configure("hibernate.xml"); 
	    
//	    SessionFactory factory = new Configuration().configure("hibernate.xml").buildSessionFactory();
//	    System.out.println(factory);
	    
	    
	    SessionFactory factory = HibernateUtil.getSessionFactory();
	   
	    Aeroport aero2 = new Aeroport();

	    aero2.setNom("CasaAero");
	    aero2.setVilleDepart("Casa");
	    aero2.setVilleArrivee("Madrid");
	    aero2.setPays("spaine");
	    
	    Session session= factory.openSession();
	    Transaction tx= (Transaction) session.beginTransaction();
	    session.save(aero2);
	    tx.commit();
	    session.close();
	    
	    
	    
	    
	    
	    
//	    System.out.println(factory);
	    
	}

}
