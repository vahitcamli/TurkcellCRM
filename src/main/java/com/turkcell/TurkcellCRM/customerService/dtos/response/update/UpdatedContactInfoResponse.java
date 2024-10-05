package com.turkcell.TurkcellCRM.customerService.dtos.response.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatedContactInfoResponse {
	private String email;
	private String homePhone;
	private String mobilePhone;
	private String tax;
}