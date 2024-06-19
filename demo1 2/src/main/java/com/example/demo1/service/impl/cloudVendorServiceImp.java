package com.example.demo1.service.impl;

import com.example.demo1.model.cloudVendor;
import com.example.demo1.service.cloudVendorService;
import com.example.demo1.repository.cloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cloudVendorServiceImp implements cloudVendorService {



    cloudVendorRepository cloudvendorrepository;

    public cloudVendorServiceImp(cloudVendorRepository cloudvendorrepository) {
        this.cloudvendorrepository = cloudvendorrepository;
    }

    @Override
    public String createcloudVendor(cloudVendor cloudvendor) {
        cloudvendorrepository.save(cloudvendor);
        return "Sccessfully saved ";
    }

    @Override
    public String updatecloudVendor(cloudVendor cloudvendor) {
        cloudvendorrepository.save(cloudvendor);
        return "Sxfully updated";
    }

    @Override
    public String deletecloudVendor(String cloudvendorId) {
        cloudvendorrepository.deleteAll();
        return "deleted properly";
    }

    @Override
    public cloudVendor getcloudVendor(String cloudVendorId) {

        return cloudvendorrepository.findById(cloudVendorId).get();
    }

    @Override
    public List<cloudVendor> getAllcloudVendors() {
        return cloudvendorrepository.findAll();
    }
}
