package com.schuler.storeAPI.service;

import com.schuler.storeAPI.domain.Brand;
import com.schuler.storeAPI.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepository repo;

    public Brand find(Integer id){
        Optional<Brand> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
