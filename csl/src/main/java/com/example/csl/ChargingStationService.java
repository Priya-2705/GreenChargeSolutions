package com.example.csl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.model.ChargingStation;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateless;

@Stateless
public class ChargingStationService {

    private List<ChargingStation> stations;

    @PostConstruct
    public void init() {
        stations = new ArrayList<>();

        stations.add(new ChargingStation(1, "GreenCharge - Gastown Hub", "Vancouver, BC - Water St", true, 100));
        stations.add(new ChargingStation(2, "GreenCharge - Granville Express", "Vancouver, BC - Granville St", false, 120));
        stations.add(new ChargingStation(3, "GreenCharge - Kitsilano Power", "Vancouver, BC - 4th Ave", true, 150));
        stations.add(new ChargingStation(4, "GreenCharge - Main Street Rapid", "Vancouver, BC - Main St", true, 90));
        stations.add(new ChargingStation(5, "GreenCharge - Commercial Drive", "Vancouver, BC - Commercial Dr", false, 80));
        stations.add(new ChargingStation(6, "GreenCharge - UBC EcoPort", "Vancouver, BC - University Blvd", true, 200));
        stations.add(new ChargingStation(7, "GreenCharge - Pacific Centre", "Vancouver, BC - Georgia St", true, 110));
        stations.add(new ChargingStation(8, "GreenCharge - Mount Pleasant", "Vancouver, BC - Kingsway", false, 70));
        stations.add(new ChargingStation(9, "GreenCharge - Hastings QuickCharge", "Vancouver, BC - Hastings St", true, 130));
        stations.add(new ChargingStation(10, "GreenCharge - Richmond Central", "Richmond, BC - No. 3 Rd", false, 160));
        stations.add(new ChargingStation(11, "GreenCharge - Burnaby Heights", "Burnaby, BC - Hastings St", true, 75));
        stations.add(new ChargingStation(12, "GreenCharge - Metrotown PlugPoint", "Burnaby, BC - Central Blvd", true, 140));
        stations.add(new ChargingStation(13, "GreenCharge - New West Riverfront", "New Westminster, BC - Columbia St", false, 90));
        stations.add(new ChargingStation(14, "GreenCharge - Surrey Gateway", "Surrey, BC - King George Blvd", true, 180));
        stations.add(new ChargingStation(15, "GreenCharge - Coquitlam Station", "Coquitlam, BC - Barnet Hwy", false, 110));
        stations.add(new ChargingStation(16, "GreenCharge - Langley Supercharge", "Langley, BC - Fraser Hwy", true, 220));
        stations.add(new ChargingStation(17, "GreenCharge - North Shore Boost", "North Vancouver, BC - Lonsdale Ave", true, 95));
    }

    public List<ChargingStation> getAllStations() {
        return stations;
    }

    public List<ChargingStation> getAvailableStations() {
        return stations.stream().filter(ChargingStation::getAvailability).collect(Collectors.toList());
    }

    public List<ChargingStation> getUnavailableStations() {
        return stations.stream().filter(station -> !station.getAvailability()).collect(Collectors.toList());
    }
}