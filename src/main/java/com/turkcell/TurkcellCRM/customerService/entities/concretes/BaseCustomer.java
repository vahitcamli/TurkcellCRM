package com.turkcell.TurkcellCRM.customerService.entities.concretes;

import java.util.List;

import com.turkcell.TurkcellCRM.commonPackage.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customers")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseCustomer extends BaseEntity {

	@Column(name = "type")
	private String type;

	@OneToOne(mappedBy = "customer")
	private ContactInfo contactInfo;

	@OneToMany(mappedBy = "customer")
	private List<Address> addresses;
}
