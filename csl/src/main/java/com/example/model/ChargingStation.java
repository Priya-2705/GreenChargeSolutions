package com.example.model;

public class ChargingStation {

	private Integer id;
	private String name;
	private String location;
	private Boolean availability;
	private Integer chargingSpeed;

	public ChargingStation(Integer id, String name, String location, Boolean availability, Integer chargingSpeed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.availability = availability;
		this.chargingSpeed = chargingSpeed;
	}

	
	public ChargingStation() {}


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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public Integer getChargingSpeed() {
		return chargingSpeed;
	}

	public void setChargingSpeed(Integer chargingSpeed) {
		this.chargingSpeed = chargingSpeed;
	}

}
