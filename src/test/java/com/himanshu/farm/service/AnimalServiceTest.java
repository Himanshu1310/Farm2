package com.himanshu.farm.service;




import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.himanshu.farm.entity.Animal;
import com.himanshu.farm.repository.AnimalRepository;
@SpringBootTest
class AnimalServiceTest {
	@Autowired
	private AnimalService animalService;
	
	@BeforeEach
	void setUp() {
//		Animal animal = Animal.builder()
//				.animalName("Dog")
//				.animalQuantity(6)
//				.animalType("Domestic")
//				.animalId(2)
//				.build();
//		
//		Mockito.when(animalRepository.findByAnimalNameIgnoreCase("Dog")).thenReturn(animal);
	}
	@Test
	public void whenValidAnimalName_thenAnimalShouldFound() {
		String animalName = "Dog";
		Animal found = animalService.fetchAnimalByName(animalName);
		assertEquals(animalName, found.getAnimalName());
	}

}
