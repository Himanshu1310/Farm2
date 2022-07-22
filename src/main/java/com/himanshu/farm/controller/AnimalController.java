package com.himanshu.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.farm.entity.Animal;
import com.himanshu.farm.service.AnimalService;

@RestController
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	@PostMapping("/animals")
	public Animal saveAnimal( @RequestBody Animal animal) {
		
		return animalService.saveAnimal(animal);
	}
	@GetMapping("/home")
	public String get() {
		return "welcome to my farm";
	}
	@GetMapping ("/animals")
	public List<Animal> fetchAnimalList(){
		return animalService.fetchAnimalList();
		
	}
	@GetMapping ("/animals/{id}")
	public Animal fetchAnimalById(@PathVariable("id") Long animalId) {
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
