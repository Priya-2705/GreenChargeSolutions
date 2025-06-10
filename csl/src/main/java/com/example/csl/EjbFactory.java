package com.example.csl;

import javax.naming.InitialContext;

public class EjbFactory {
    public ChargingStationService lookupChargingStationService() throws Exception {
        return (ChargingStationService) new InitialContext().lookup(
            "java:global/ROOT/ChargingStationService!com.example.csl.ChargingStationService");
    }
}

