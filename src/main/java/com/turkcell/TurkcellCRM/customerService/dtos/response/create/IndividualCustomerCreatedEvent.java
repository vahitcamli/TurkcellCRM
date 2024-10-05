package com.turkcell.TurkcellCRM.customerService.dtos.response.create;

import java.time.LocalDateTime;

import com.turkcell.TurkcellCRM.commonPackage.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IndividualCustomerCreatedEvent {
	private String firstName;
	private String secondName;
	private String lastName;
	private LocalDateTime birthDate;
	private Gender gender;
	private String fatherName;
	private String motherName;
	private String nationalityNumber;
}