package com.ead.fms.service.impl;

import com.ead.fms.entity.Farmer;
import com.ead.fms.repository.FarmerRepository;
import com.ead.fms.service.FarmerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerServiceImpl implements FarmerService {

    private FarmerRepository farmerRepository;

    public FarmerServiceImpl(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    @Override
    public List<Farmer> getAllFarmers(){
        return farmerRepository.findAll();
    }

    @Override
    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id).get();
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public void deleteFarmerById(Long id) {
        farmerRepository.deleteById(id);
    }
}
