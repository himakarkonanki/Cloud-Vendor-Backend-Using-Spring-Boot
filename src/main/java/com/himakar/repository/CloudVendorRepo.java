package com.himakar.repository;

import com.himakar.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepo extends JpaRepository<CloudVendor,Integer> {
}
