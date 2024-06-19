package com.example.demo1.controller;

import com.example.demo1.model.cloudVendor;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.service.cloudVendorService;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorController {
   cloudVendorService cloudvendorservice;

    public cloudVendorController(cloudVendorService cloudvendorservice) {
        this.cloudvendorservice = cloudvendorservice;
    }
// Read Specific cloudVendor
    @GetMapping("{vendorID}")
    public cloudVendor getVendordetails(@PathVariable("vendorID") String vendorID){

        return cloudvendorservice.getcloudVendor(vendorID);
    }
    //REad All cloud vendors
    @GetMapping()
    public List<cloudVendor> getAllVendordetails(@PathVariable("vendorID") String vendorID){

        return cloudvendorservice.getAllcloudVendors();
    }
   @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudVendor cloudvendor){


       cloudvendorservice.createcloudVendor(cloudvendor);
       return "vendor created sexfully";


    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudVendor cloudvendor){
      cloudvendorservice.updatecloudVendor(cloudvendor);
        return "vendor updated sexfully";


    }
    @DeleteMapping ("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        cloudvendorservice.deletecloudVendor(vendorID);
        return "vendor deleted sexfully";


    }}



