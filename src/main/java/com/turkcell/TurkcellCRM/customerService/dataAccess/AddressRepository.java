package com.turkcell.TurkcellCRM.customerService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.TurkcellCRM.customerService.entities.concretes.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
