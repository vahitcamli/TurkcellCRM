package com.turkcell.TurkcellCRM.customerService.entities.concretes;

import com.turkcell.TurkcellCRM.commonPackage.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {
	@Column(name = "city")
	private String city;

	@Column(name = "street")
	private String street;

	@Column(name = "houseNumber")
	private String houseNumber;

	@Column(name = "addressDescription")
	private String addressDescription;

	@Column(name = "isDeleted")
	private boolean deleted = false;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private BaseCustomer customer;
}