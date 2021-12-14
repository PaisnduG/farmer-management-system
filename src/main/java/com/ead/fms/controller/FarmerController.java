package com.ead.fms.controller;

import com.ead.fms.entity.Farmer;
import com.ead.fms.service.FarmerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FarmerController {

    private FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    @GetMapping("/farmers")
    public String ListFarmers(Model model){
        model.addAttribute("farmers", farmerService.getAllFarmers());
        return "farmers";
    }

    @GetMapping("/farmers/new")
    public String createFarmerForm(Model model){

        //  Create farmer object to hold farmer form data
        Farmer farmer = new Farmer();
        model.addAttribute("farmer", farmer);
        return "create_farmer";
    }

    @PostMapping("/farmers")
    public String saveFarmer(@ModelAttribute("farmer") Farmer farmer){
        farmerService.saveFarmer(farmer);
        return "redirect:/farmers";
    }

    @GetMapping("/farmers/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("farmer", farmerService.getFarmerById(id));
        return "edit_student";
    }

    @PostMapping("/farmers/{id}")
    public String updateFarmer(@PathVariable Long id, @ModelAttribute("farmer") Farmer farmer, Model model){

        // get farmer from db by id
        Farmer exsistingFarmer = farmerService.getFarmerById(id);
        exsistingFarmer.setId(id);
        exsistingFarmer.setFirstName(farmer.getFirstName());
        exsistingFarmer.setLastName(farmer.getLastName());
        exsistingFarmer.setEmail(farmer.getEmail());

        //  save updated farmer
        farmerService.updateFarmer(exsistingFarmer);
        return "redirect:/farmers";
    }

    @GetMapping("/farmers/{id}")
    public String deleteFarmer(@PathVariable Long id){
        farmerService.deleteFarmerById(id);
        return "redirect:/farmers";

    }
}
