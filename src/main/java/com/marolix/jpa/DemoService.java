package com.marolix.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "demoService")
public class DemoService {
	@Autowired
	private DemoRepo demoRepo;

	public String insertEntity(DemoEntity entity) {
		demoRepo.save(entity);
		return "inserted successfully";
	}

	public DemoEntity readEntity(DemoEntity entity) {
		Optional<DemoEntity> optional = demoRepo.findById(entity.getId());
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

	public DemoEntity updateEntity(String name, Integer id) {
		Optional<DemoEntity> optional = demoRepo.findById(id);
		if (optional.isPresent()) {
			DemoEntity dm = optional.get();
			dm.setName(name);
			demoRepo.save(dm);
			return dm;
		} else
			throw new RuntimeException("no entity found with id " + id);
	}

	public void deleteEntity(Integer id) {
//		demoRepo.deleteById(id);
		Optional<DemoEntity> dm = demoRepo.findById(id);
		// Supplier
		DemoEntity e = dm.orElseThrow(() -> new RuntimeException("no entity found with id " + id));

		demoRepo.delete(e);
		System.out.println("deleted successfully");
	}

	public List<DemoEntity> readAllEntities() {
		Iterable<DemoEntity> itr = demoRepo.findAll();
		List<DemoEntity> l = new ArrayList<DemoEntity>();
		for (DemoEntity i : itr) {
			l.add(i);
		}
		return l;
	}

	public List<DemoEntity> readAll(Set<Integer> s) {

		Iterable<DemoEntity> itr = demoRepo.findAllById(s);
		List<DemoEntity> l = new ArrayList<DemoEntity>();
		for (DemoEntity i : itr) {
			l.add(i);
		}
		return l;

	}
	public void deleteAll() {
		demoRepo.deleteAll();
		System.out.println("deleted all enties");
	}
}
