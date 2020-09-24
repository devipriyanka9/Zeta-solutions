package com.he.addressBook;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class PhoneNumber {

	@NotEmpty(message = "should not be empty")
	@Size(min = 3, max = 255, message = "Characters should not exceed 255 length")
	private String label;

	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNumber;

	public PhoneNumber(String label, String phoneNumber) throws Exception {
		// TODO
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
