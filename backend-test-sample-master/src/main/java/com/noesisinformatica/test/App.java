package com.noesisinformatica.test;

import java.io.IOException;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )throws Exception
    {
    	try{
        DataService dataService = new DataService();
        
        dataService.setData("Fourth Term");
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(DataService.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sf = configuration.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction t= session.beginTransaction(); 
        session.save(dataService);
        t.commit();
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		System.out.println(e);
		}
    }
}
