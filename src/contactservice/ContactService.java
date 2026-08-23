package contactservice;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

	private final List<Contact> contacts = new ArrayList<>();
	
	public void addContact(Contact contact) {
		
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("Duplicate contact ID");
			}
		}
		
		contacts.add(contact);
	}
	
	public Contact getContact(String contactId) {
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				return new Contact(
						contact.getContactId(),
						contact.getFirstName(),
						contact.getLastName(),
						contact.getPhone(),
						contact.getAddress());
			}
		}
		
		return null;
	}
	
	public void deleteContact(String contactId) {
		
		contacts.removeIf(contact ->
			contact.getContactId().equals(contactId));
	}

	public void updateContact(Contact contact) {
		for (Contact existingContact : contacts) {
			if(existingContact.getContactId().equals(contact.getContactId())) {
				existingContact.setFirstName(contact.getFirstName());
				existingContact.setLastName(contact.getLastName());
				existingContact.setPhone(contact.getPhone());
				existingContact.setAddress(contact.getAddress());
				return;
			}
		}
	}	
}

