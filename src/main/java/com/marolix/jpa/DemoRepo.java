package com.marolix.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

//@Repository
//public class DemoRepo {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	@Transactional
//	public DemoEntity save(DemoEntity d) {
//		em.persist(d);
//
//		return d;
//	}
//}

public interface DemoRepo extends CrudRepository<DemoEntity, Integer> {

}
