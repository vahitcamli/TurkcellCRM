package com.turkcell.TurkcellCRM.customerService.dtos.request.update;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAddressRequest {
	@NotNull
	private String city;

	@NotNull
	private String street;

	@NotNull
	private String houseNumber;

	@NotNull
	private String addressDescription;
}
