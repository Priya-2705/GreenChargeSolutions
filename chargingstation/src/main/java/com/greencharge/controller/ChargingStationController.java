package com.greencharge.controller;

import com.greencharge.service.ChargingStationService;

import jakarta.ejb.EJB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChargingStationController {

    @EJB
    private ChargingStationService stationService;

    @GetMapping("/")
    @ResponseBody
    public String testRoot() {
        return "Spring MVC is working";
    }
    
    @GetMapping("/stations")
    public String showAllStations(Model model) {
        model.addAttribute("stations", stationService.getAllStations());
        return "allStations";
    }

    @GetMapping("/stations/available")
    public String showAvailableStations(Model model) {
        model.addAttribute("stations", stationService.getAvailableStations());
        return "availableStations";
    }
}