package com.turkcell.TurkcellCRM.customerService.dataAccess;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.TurkcellCRM.customerService.entities.concretes.IndividualCustomer;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer, Integer> {
	Optional<IndividualCustomer> findByNationalityNumber(String nationalityId);

}
