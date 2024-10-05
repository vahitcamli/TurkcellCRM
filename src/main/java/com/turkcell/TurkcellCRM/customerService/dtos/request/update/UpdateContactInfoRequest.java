package com.turkcell.TurkcellCRM.customerService.dtos.request.update;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateContactInfoRequest {
	@Email
	@NotNull
	private String email;
	private String homePhone;
	@NotNull
	private String mobilePhone;
	private String tax;
}