package com.dsniatecki.yourfleetmanager.dto.car;

import com.dsniatecki.yourfleetmanager.dto.vehicleresponder.VehicleResponderDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDTO {

    private Long id;
    private String brand;
    private String model;
    private int productionYear;
    private String registrationNumber;
    private VehicleResponderDTO vehicleResponder;

}
