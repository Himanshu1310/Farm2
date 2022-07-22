package com.himanshu.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himanshu.farm.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
	public Animal findByAnimalName(String animalName);

}
