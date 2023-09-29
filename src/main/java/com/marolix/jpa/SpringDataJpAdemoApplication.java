package com.marolix.jpa;

import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class SpringDataJpAdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringDataJpAdemoApplication.class, args);
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		DemoEntity dm = new DemoEntity(1, "demo");
//		em.persist(dm);
//		et.begin();
//		et.commit();
//
//		em.close();
//		emf.close();
		DemoEntity dm = new DemoEntity(5, "sharath");
		DemoService demo = con.getBean(DemoService.class);
		// System.out.println(demo.insertEntity(dm));
		// System.out.println(demo.readEntity(dm));
		// System.out.println(demo.updateEntity("johny", 37));
		// demo.deleteEntity(1);
		//System.out.println(demo.readAllEntities());
		;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		//System.out.println(demo.readAll(ts));
		demo.deleteAll();
	}

}
