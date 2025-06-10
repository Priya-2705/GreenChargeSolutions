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

		stations.add(new ChargingStation(1, "Downtown EV Station", "Toronto, ON - Front St", true, 120));
		stations.add(new ChargingStation(2, "Harbourfront Fast Charge", "Toronto, ON - Queens Quay W", false, 150));
		stations.add(new ChargingStation(3, "Yonge & Dundas Supercharger", "Toronto, ON - Yonge St", true, 250));
		stations.add(new ChargingStation(4, "Union Station ChargePoint", "Toronto, ON - Bay St", true, 100));
		stations.add(new ChargingStation(5, "Scarborough EV Hub", "Toronto, ON - Lawrence Ave", false, 50));
		stations.add(new ChargingStation(6, "North York Green Energy", "Toronto, ON - Sheppard Ave", true, 200));
		stations.add(new ChargingStation(7, "High Park EV Station", "Toronto, ON - Bloor St W", true, 75));
		stations.add(new ChargingStation(8, "Liberty Village EV Plug", "Toronto, ON - Liberty St", false, 60));
		stations.add(new ChargingStation(9, "East York PowerPoint", "Toronto, ON - Coxwell Ave", true, 110));
		stations.add(new ChargingStation(10, "Uptown Rapid Charge", "Toronto, ON - Eglinton Ave", false, 180));
		stations.add(new ChargingStation(11, "Kensington Market Station", "Toronto, ON - Augusta Ave", true, 70));
		stations.add(new ChargingStation(12, "Toronto Zoo EV Hub", "Toronto, ON - Meadowvale Rd", true, 100));
		stations.add(new ChargingStation(13, "Exhibition Place Charger", "Toronto, ON - Princes' Blvd", false, 200));
		stations.add(new ChargingStation(14, "Roncesvalles Green Plug", "Toronto, ON - Roncesvalles Ave", true, 50));
		stations.add(new ChargingStation(15, "Etobicoke Fast Charge", "Toronto, ON - Kipling Ave", false, 160));
		stations.add(new ChargingStation(16, "Yorkdale Mall Supercharge", "Toronto, ON - Dufferin St", true, 250));
		stations.add(new ChargingStation(17, "Don Mills EcoCharge", "Toronto, ON - Don Mills Rd", true, 100));

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
