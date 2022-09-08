package com.himanshu.farm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Table(name = "Animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalId;
	@NotBlank(message = "Please add animal name")
	private String animalName;
	private int animalQuantity;
	private String animalType;
	
//	public long getAnimalId() {
//		return animalId;
//	}
//	public void setAnimalId(long animalId) {
//		this.animalId = animalId;
//	}
//	public String getAnimalName() {
//		return animalName;
//	}
//	public void setAnimalName(String animalName) {
//		this.animalName = animalName;
//	}
//	public int getAnimalQuantity() {
//		return animalQuantity;
//	}
//	public void setAnimalQuantity(int animalQuantity) {
//		this.animalQuantity = animalQuantity;
//	}
//	public String getAnimalType() {
//		return animalType;
//	}
//	public void setAnimalType(String animalType) {
//		this.animalType = animalType;
//	}
//	public Animal(long animalId, String animalName, int animalQuantity, String animalType) {
//		super();
//		this.animalId = animalId;
//		this.animalName = animalName;
//		this.animalQuantity = animalQuantity;
//		this.animalType = animalType;
//	}
//	public Animal() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Animal [animalId=" + animalId + ", animalName=" + animalName + ", animalQuantity=" + animalQuantity
//				+ ", animalType=" + animalType + "]";
//	}
	

}
