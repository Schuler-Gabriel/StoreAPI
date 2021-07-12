package com.schuler.storeAPI.repository;

import com.schuler.storeAPI.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
}
