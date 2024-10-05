package com.turkcell.TurkcellCRM.customerService.dtos.response.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatedIndividualCustomerResponse {
	private String firstName;
	private String lastName;
	private String nationalityNumber;
}