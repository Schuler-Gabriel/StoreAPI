package com.schuler.storeAPI.repository;

import com.schuler.storeAPI.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{
}
