package com.turkcell.TurkcellCRM.customerService.dtos.response.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatedAddressResponse {
	private String city;
	private String street;
	private String houseNumber;
	private String addressDescription;
}
