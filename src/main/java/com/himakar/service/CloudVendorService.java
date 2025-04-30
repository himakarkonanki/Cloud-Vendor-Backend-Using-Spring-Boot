package com.himakar.service;

import com.himakar.model.CloudVendor;
import com.himakar.repository.CloudVendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorService {

    CloudVendorRepo cloudVendorRepo;

    @Autowired
    public CloudVendorService(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo=cloudVendorRepo;
    }

    public void createCloudVendor(CloudVendor cloudVendor){
        cloudVendorRepo.save(cloudVendor);
    }

    public void updateCloudVendor(int vendorId, CloudVendor updatecloudVendor){
        CloudVendor existingcloudVendor= cloudVendorRepo.findById(vendorId).get();
        existingcloudVendor.setVendorName(updatecloudVendor.getVendorName());
        existingcloudVendor.setVendorAddress(updatecloudVendor.getVendorAddress());
        existingcloudVendor.setVendorPhoneNumber(updatecloudVendor.getVendorPhoneNumber());
        cloudVendorRepo.save(existingcloudVendor);
    }

    public CloudVendor getCloudVendorById(int vendorId){
        return cloudVendorRepo.findById(vendorId).get();
    }
    public List<CloudVendor>getAllCloudVendors(){
        return cloudVendorRepo.findAll();
    }
    public void deleteCloudVendor(int vendorId){
        cloudVendorRepo.deleteById(vendorId);
    }

}
