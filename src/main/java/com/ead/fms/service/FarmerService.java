package com.ead.fms.service;

import com.ead.fms.entity.Farmer;

import java.util.List;

public interface FarmerService {
    List<Farmer> getAllFarmers();

    Farmer saveFarmer(Farmer farmer);

    Farmer getFarmerById(Long id);
    Farmer updateFarmer(Farmer farmer);

    void deleteFarmerById(Long id);
}
