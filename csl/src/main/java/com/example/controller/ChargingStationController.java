package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.csl.ChargingStationService;
import com.example.model.ChargingStation;

import jakarta.annotation.Resource;
//import jakarta.ejb.EJB;

@Controller
@RequestMapping("/stations")
public class ChargingStationController {

//	@EJB
//	private ChargingStationService chargingStationService;

	@Resource(lookup = "java:global/ROOT/ChargingStationService!com.example.csl.ChargingStationService")
	private ChargingStationService chargingStationService;

	@GetMapping
	public String getAllStations(Model model) {
		List<ChargingStation> stations = chargingStationService.getAllStations();
		model.addAttribute("stations", stations);
		model.addAttribute("count", stations.size());
		return "all";
	}

	@GetMapping("/available")
	public String getAvailableStations(Model model) {
		List<ChargingStation> stations = chargingStationService.getAvailableStations();
		model.addAttribute("stations", chargingStationService.getAvailableStations());
		model.addAttribute("count", stations.size());
		return "available";
	}

	@GetMapping("/unavailable")
	public String getUnavailableStations(Model model) {
		List<ChargingStation> stations = chargingStationService.getUnavailableStations();
		model.addAttribute("stations", chargingStationService.getUnavailableStations());
		model.addAttribute("count", stations.size());
		return "unavailable";
	}
}
