package com.turkcell.TurkcellCRM.customerService.api.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TurkcellCRM.customerService.business.abstracts.IndividualCustomerService;
import com.turkcell.TurkcellCRM.customerService.dtos.request.create.CreateIndividualCustomerRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.request.update.UpdateIndividualCustomerRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.response.create.CreatedIndividualCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetAllIndividualCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetIndividualCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.update.UpdatedIndividualCustomerResponse;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/customers")
public class IndividualCustomerController {
	private IndividualCustomerService customerService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CreatedIndividualCustomerResponse add(
			@Valid @RequestBody CreateIndividualCustomerRequest createCustomerRequest) {

		return customerService.add(createCustomerRequest);
	}

	@PutMapping("/{customerId}")
	@ResponseStatus(HttpStatus.OK)
	public UpdatedIndividualCustomerResponse update(
			@Valid @RequestBody UpdateIndividualCustomerRequest updateCustomerRequest, @PathVariable int customerId) {
		return customerService.update(updateCustomerRequest, customerId);
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)

	public boolean existCustomerById(@PathVariable int id) {
		return customerService.existCustomerById(id);
	}

	public GetIndividualCustomerResponse getById(@PathVariable int id) {
		return customerService.getById(id);

	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<GetAllIndividualCustomerResponse> getAll() {
		return customerService.getAll();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		customerService.delete(id);
	}
}