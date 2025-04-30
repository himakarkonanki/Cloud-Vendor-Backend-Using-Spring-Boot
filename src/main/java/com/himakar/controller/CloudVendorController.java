package com.himakar.controller;

import com.himakar.model.CloudVendor;
import com.himakar.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/cloudvendor")
    public ResponseEntity<List <CloudVendor> > getAll(){
        return ResponseEntity
                .status(200)
                .body(cloudVendorService.getAllCloudVendors());
    }

    @GetMapping("/cloudvendor/{id}")
    public ResponseEntity <CloudVendor> getById(@PathVariable int id){
        return ResponseEntity
                .status(200)
                .body(cloudVendorService.getCloudVendorById(id));
    }

    @PostMapping("/cloudvendor/add")
    public String createVendor(@RequestBody CloudVendor cloudVendor){
         cloudVendorService.createCloudVendor(cloudVendor);
         return "Success";
    }

    @PutMapping("cloudvendor/update/{id}")
    public String updateVendor(@PathVariable int id, @RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(id, cloudVendor);
        return "Cloud vendor updated successfully!";
    }

    @DeleteMapping("cloudvendor/delete/{id}")
    public String deleteVendor(@PathVariable int id){
        cloudVendorService.deleteCloudVendor(id);
        return "Cloud vendor deleted Successfully";
    }


}
