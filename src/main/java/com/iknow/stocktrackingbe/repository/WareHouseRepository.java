package com.iknow.stocktrackingbe.repository;

import com.iknow.stocktrackingbe.model.WareHouse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouse,String> {

    Page<WareHouse> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
}
