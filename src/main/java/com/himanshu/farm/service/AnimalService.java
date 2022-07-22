package com.himanshu.farm.service;

import java.util.List;

import com.himanshu.farm.entity.Animal;

public interface AnimalService {

	public Animal saveAnimal(Animal animal);

	public List<Animal> fetchAnimalList();
	
	public Animal fetchAnimalById(Long animalId);
	
	public void deleteAnimalById(Long animalId);



	public Animal updateAnimalById(Long animalId, Animal animal);

	public Animal fetchAnimalByName(String animalName);

}
