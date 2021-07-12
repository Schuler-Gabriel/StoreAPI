package com.schuler.storeAPI.resources;


import com.schuler.storeAPI.domain.Brand;
import com.schuler.storeAPI.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/brands")
public class BrandResource {

    @Autowired
    private BrandService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Brand> find(@PathVariable Integer id) {
        Brand obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
    
    
}
