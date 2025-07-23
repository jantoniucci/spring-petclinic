package org.springframework.samples.petclinic.owner.dto;

import java.util.List;

/**
 * Data Transfer Object representing an Owner in the REST API layer. This keeps the API
 * payload independent from the JPA entity so the database schema can evolve without
 * breaking clients.
 */
public class OwnerDto {

	private Integer id;

	private String firstName;

	private String lastName;

	private String address;

	private String city;

	private String telephone;

	private List<PetDto> pets;

	public OwnerDto() {
	}

	public OwnerDto(Integer id, String firstName, String lastName, String address, String city, String telephone,
			List<PetDto> pets) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<PetDto> getPets() {
		return pets;
	}

	public void setPets(List<PetDto> pets) {
		this.pets = pets;
	}

}
