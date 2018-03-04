package com.noesisinformatica.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	private SessionFactory sf;
    private Session session = null;
	
	
       
    @Test
    public void testdatabaseTest(){
    	Configuration configuration = new Configuration().configure().addAnnotatedClass(DataService.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sf = configuration.buildSessionFactory(reg);
        Session session = sf.openSession();
        DataService dataService = new DataService();      
        dataService = (DataService) session.get(DataService.class, 1001);
        assertNotNull(dataService);

    }

}
