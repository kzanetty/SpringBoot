package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepositoy;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    final ParkingSpotRepositoy parkingSpotRepositoy;

    public ParkingSpotService(ParkingSpotRepositoy parkingSpotRepositoy){
        this.parkingSpotRepositoy = parkingSpotRepositoy;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepositoy.save(parkingSpotModel);
    }


    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepositoy.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepositoy.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepositoy.existsByApartmentAndBlock(apartment, block);
    }

    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepositoy.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepositoy.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepositoy.delete(parkingSpotModel);
    }
}
