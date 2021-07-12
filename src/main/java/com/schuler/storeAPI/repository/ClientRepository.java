package com.schuler.storeAPI.repository;

import com.schuler.storeAPI.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
}
