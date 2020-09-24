package com.he.addressBook;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Address {

	@NotEmpty(message = "should not be empty")
	@Size(min=3,max=255,message = "Characters should not exceed 255 length")
	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
