package com.turkcell.TurkcellCRM.customerService.dtos.response.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreatedAddressResponse {
	private String city;
	private String street;
	private String houseNumber;
}