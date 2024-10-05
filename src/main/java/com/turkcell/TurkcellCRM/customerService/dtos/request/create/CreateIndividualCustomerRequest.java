package com.turkcell.TurkcellCRM.customerService.dtos.request.create;

import java.time.LocalDateTime;

import com.turkcell.TurkcellCRM.commonPackage.Gender;
import com.turkcell.TurkcellCRM.commonPackage.enums.Roles;
import com.turkcell.TurkcellCRM.customerService.business.constant.Constant;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateIndividualCustomerRequest {
	@NotNull
	private String firstName;

	private String secondName;

	@NotNull
	private String lastName;

	@NotNull
	private LocalDateTime birthDate;

	@NotNull
	private Gender gender;

	private String fatherName;

	private String motherName;

	private Roles role;

	@NotNull
	@Size(min = 11, max = 11)
	@Pattern(regexp = "^[1-9]{1}[0-9]{9}[02468]{1}$")
	private String nationalityNumber;

	private static final String type = Constant.IndividualCustomer; // TODO: burası null olarak geliyor
}