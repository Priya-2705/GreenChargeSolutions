package com.greencharge.model;

public class ChargingStation {
    private int id;
    private String name;
    private String location;
    private boolean availability;
    private int chargingSpeed;

    public ChargingStation(int id, String name, String location, boolean availability, int chargingSpeed) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.availability = availability;
        this.chargingSpeed = chargingSpeed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getChargingSpeed() {
        return chargingSpeed;
    }
}