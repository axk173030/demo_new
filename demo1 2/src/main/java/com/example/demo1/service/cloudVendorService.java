package com.example.demo1.service;
import com.example.demo1.model.cloudVendor;

import java.util.List;

public interface cloudVendorService {

    public String createcloudVendor(cloudVendor cloudvendor);
    public String updatecloudVendor(cloudVendor cloudvendor);
    public String deletecloudVendor(String cloudvendorId);
    public cloudVendor getcloudVendor(String cloudVendorId);

    public List<cloudVendor> getAllcloudVendors();


}
