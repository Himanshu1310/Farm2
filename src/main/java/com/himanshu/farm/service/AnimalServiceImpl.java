package com.himanshu.farm.service;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.farm.entity.Animal;
import com.himanshu.farm.error.AnimalNotFoundException;
import com.himanshu.farm.repository.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
	@Autowired
	public AnimalRepository animalRepository;

	@Override
	public Animal saveAnimal(Animal animal) {
		
		return animalRepository.save(animal);
	}

	@Override
	public List<Animal> fetchAnimalList() {
		
		return animalRepository.findAll();
	}

	@Override
	public Animal fetchAnimalById(Long animalId) throws AnimalNotFoundException {
		
		Optional<Animal> animal =  animalRepository.findById(animalId);
		if(!animal.isPresent()) {
			throw new AnimalNotFoundException("Animal not present, it maybe be dead or set itself free");
		}
		return animal.get();
	}

	@Override
	public void deleteAnimalById(Long animalId) {
		animalRepository.deleteById(animalId);
		
	}

	@Override
	public Animal updateAnimalById(Long animalId, Animal animal) {
		Animal animaldb = animalRepository.findById(animalId).get();
		if(Objects.nonNull(animal.getAnimalName()) &&
				!"".equalsIgnoreCase(animal.getAnimalName())) {
				animaldb.setAnimalName(animal.getAnimalName());
				}
		if(Objects.nonNull(animal.getAnimalQuantity()) &&
				!"".equals(animal.getAnimalQuantity())) {
				animaldb.setAnimalQuantity(animal.getAnimalQuantity());
				}
		if(Objects.nonNull(animal.getAnimalType()) &&
				!"".equalsIgnoreCase(animal.getAnimalType())) {
				animaldb.setAnimalType(animal.getAnimalType());
				}
		return animaldb;
	}

	@Override
	public Animal fetchAnimalByName(String animalName) {
		return animalRepository.findByAnimalName(animalName);
		
	}

}
