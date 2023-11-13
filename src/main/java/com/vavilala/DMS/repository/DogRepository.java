package com.vavilala.DMS.repository;
/**
 * @author S562696
 * @author PoornaChandanReddy Vavilala
 * 
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vavilala.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{

	

	List<Dog> findByName(String name);
	
	
}
