package com.turkcell.TurkcellCRM.customerService.entities.concretes;

import com.turkcell.TurkcellCRM.commonPackage.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "contactinfos")
public class ContactInfo extends BaseEntity {

	@Column(name = "email")
	private String email;

	@Column(name = "homePhone")
	private String homePhone;

	@Column(name = "mobilePhone")
	private String mobilePhone;

	@Column(name = "tax")
	private String tax;

	@Column(name = "isDeleted")
	private boolean deleted = false;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private BaseCustomer customer;
}