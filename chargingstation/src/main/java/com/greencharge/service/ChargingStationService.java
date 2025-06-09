package com.greencharge.service;

import com.greencharge.model.ChargingStation;

import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ChargingStationService {

    private List<ChargingStation> stationList = new ArrayList<>();

    public ChargingStationService() {
        stationList.add(new ChargingStation(1, "Station A", "Toronto", true, 50));
        stationList.add(new ChargingStation(2, "Station B", "Mississauga", false, 100));
        stationList.add(new ChargingStation(3, "Station C", "Brampton", true, 75));
    }

    public List<ChargingStation> getAllStations() {
        return stationList;
    }

    public List<ChargingStation> getAvailableStations() {
        return stationList.stream()
                .filter(ChargingStation::isAvailability)
                .collect(Collectors.toList());
    }
}