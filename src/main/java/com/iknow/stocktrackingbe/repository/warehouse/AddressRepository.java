package com.iknow.stocktrackingbe.repository.warehouse;

import com.iknow.stocktrackingbe.model.warehouse.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

    List<Address> findAllByCity(String city);
}
