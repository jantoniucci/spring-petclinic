package org.springframework.samples.petclinic.owner.dto;

import java.time.LocalDate;

/**
 * DTO representing a Pet.
 */
public class PetDto {

	private Integer id;

	private String name;

	private LocalDate birthDate;

	private String type;

	public PetDto() {
	}

	public PetDto(Integer id, String name, LocalDate birthDate, String type) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
