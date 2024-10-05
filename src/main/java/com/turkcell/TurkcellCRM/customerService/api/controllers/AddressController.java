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

import com.turkcell.TurkcellCRM.customerService.business.abstracts.AddressService;
import com.turkcell.TurkcellCRM.customerService.dtos.request.create.CreateAddressRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.request.update.UpdateAddressRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.response.create.CreatedAddressResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetAddressResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetAllAddressResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.update.UpdatedAddressResponse;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/customerservice/api/v1/addresses")
public class AddressController {
	private AddressService addressService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CreatedAddressResponse add(@Valid @RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.add(createAddressRequest);
	}

	@PutMapping("/{addressId}")
	@ResponseStatus(HttpStatus.OK)
	public UpdatedAddressResponse update(@Valid @RequestBody UpdateAddressRequest updateAddressRequest,
			@PathVariable int addressId) {
		return addressService.update(updateAddressRequest, addressId);
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public GetAddressResponse getById(@PathVariable int id) {
		return addressService.getById(id);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<GetAllAddressResponse> getAll() {
		return addressService.getAll();
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		addressService.delete(id);
	}
}