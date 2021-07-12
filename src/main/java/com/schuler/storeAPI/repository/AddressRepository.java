package com.schuler.storeAPI.repository;

import com.schuler.storeAPI.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
}
