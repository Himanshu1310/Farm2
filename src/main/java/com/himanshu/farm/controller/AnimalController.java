package com.himanshu.farm.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;

import com.himanshu.farm.entity.Animal;
import com.himanshu.farm.error.AnimalNotFoundException;
import com.himanshu.farm.service.AnimalService;

@RestController
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	private final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(AnimalController.class);
	@PostMapping("/animals")
	public Animal saveAnimal(@Valid @RequestBody Animal animal) {
		LOGGER.info("Inside saveAnimal of AnimalController");
		return animalService.saveAnimal(animal);
	}
	@GetMapping("/home")
	public String get() {
		return "welcome to my farm";
	}
	@GetMapping ("/animals")
	public List<Animal> fetchAnimalList(){
		LOGGER.info("Inside fetchAnimalList of AnimalController");
		return animalService.fetchAnimalList();
		
	}
	@GetMapping ("/animals/{id}")
	public Animal fetchAnimalById(@PathVariable("id") Long animalId) throws AnimalNotFoundException {
		LOGGER.info("Inside fetchAnimalById of AnimalController");
		
		return animalService.fetchAnimalById(animalId);
		
	}
	@DeleteMapping ("/animals/{id}")
	public String deleteAnimalById(@PathVariable("id") Long animalId) {
		animalService.deleteAnimalById(animalId);
		
		return   "Successfully deleted";
	}
	@PutMapping
	public Animal updateAnimalById(@PathVariable("id") Long animalId,
									@RequestBody Animal animal) {
		return animalService.updateAnimalById( animalId, animal);
	}
@GetMapping("/animals/name/{name}")
	public Animal fetchAnimalByName(@PathVariable("name") String animalName) {
	return animalService.fetchAnimalByName(animalName);
		
	}
	
	

}
