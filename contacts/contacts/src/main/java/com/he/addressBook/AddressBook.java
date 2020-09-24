package com.he.addressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.he.addressBook.exception.CustomizedException;

public class AddressBook {

	private HashMap<String, Contact> contactList;

	public AddressBook() {
		contactList = new HashMap<String, Contact>();
	}

	public void addContact(Contact contact) throws CustomizedException {
		if (contactList.containsKey(contact.getName())) {
			// TODO
			contactList.put(contact.getName(), contact);
		} else {
			throw new CustomizedException("duplicate contact");
		}

	}

	public void deleteContact(String name) throws CustomizedException {
		// TODO
		if (contactList.containsKey(name)) {
			contactList.remove(name);
		} else {
			throw new CustomizedException("no contact found");
		}
	}

	public void updateContact(String name, Contact contact) throws CustomizedException {

		// TODO
		if (contactList.containsKey(name)) {

			contactList.replace(name, contact);
		} else {
			throw new CustomizedException("no contact found");
		}
	}

	public List<Contact> searchByName(String name) {

		List<Contact> contacts = new ArrayList<Contact>();
		// TODO
		for (Entry<String, Contact> set : contactList.entrySet()) {
			if (name.contains(set.getKey())) {
				contacts.add(set.getValue());
			}
		}
		return contacts;
	}

	public List<Contact> searchByOrganisation(String organisation) {
		// TODO
		List<Contact> contacts = new ArrayList<Contact>();
		for (Entry<String, Contact> set : contactList.entrySet()) {
			Contact contact = set.getValue();
			if (organisation.contains(contact.getOrganisation())) {
				contacts.add(contact);
			}
		}
		return contacts;
	}

}