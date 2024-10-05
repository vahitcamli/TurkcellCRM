package com.turkcell.TurkcellCRM.customerService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.TurkcellCRM.customerService.entities.concretes.ContactInfo;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
}
