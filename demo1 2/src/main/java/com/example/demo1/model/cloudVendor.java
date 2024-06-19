package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class cloudVendor {

    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;


    private String vendorPhoneNumber;

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public cloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber){
        this.vendorName=vendorName;
        this.vendorAddress=vendorAddress;
        this.vendorId=vendorId;
        this.vendorPhoneNumber=vendorPhoneNumber;
    }
    public cloudVendor(){}

}
