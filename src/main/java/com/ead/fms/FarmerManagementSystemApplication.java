package com.ead.fms;

import com.ead.fms.entity.Farmer;
import com.ead.fms.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmerManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FarmerManagementSystemApplication.class, args);
    }

    @Autowired
    private FarmerRepository farmerRepository;

    @Override
    public void run(String... args) throws Exception {

//        Farmer farmer1 = new Farmer("Pasindu", "Premachandra", "pasindu@gmail.com");
//        farmerRepository.save(farmer1);
//
//        Farmer farmer2 = new Farmer("Gajitha", "Kavinda", "gajitha@gmail.com");
//        farmerRepository.save(farmer2);
//
//        Farmer farmer3 = new Farmer("Thisal", "Vindula", "thisal@gmail.com");
//        farmerRepository.save(farmer3);
    }
}
