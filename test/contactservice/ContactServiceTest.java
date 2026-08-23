package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	public void testAddContact_withValidContact_addsContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		service.addContact(contact);
		
		Contact storedContact = service.getContact("12345");
		
		assertEquals(contact, storedContact);
		
	}
		
	@Test
	public void testAddContact_withDupllicatedContactId_throwsIllegalArgumentException() {
		
		ContactService service = new ContactService();
		
		Contact contact1 = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		Contact contact2 = new Contact(
				"12345",
				"Jane",
				"Jones",
				"0987654321",
				"456 Oak Avenue");
		
		service.addContact(contact1);
		
		assertThrows(IllegalArgumentException.class,() -> {
			service.addContact(contact2);
		});
	}

	@Test
	public void testupdateContact_withValidContact_updateContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		service.addContact(contact);
		
		Contact updatedContact = new Contact(
				"12345",
				"Jane",
				"Jones",
				"0987654321",
				"456 Oak Avenue");
				
		service.updateContact(updatedContact);
		
		Contact storedContact = service.getContact("12345");
		
		assertEquals(updatedContact, storedContact);
		
	}

	@Test
	public void testDeleteContact_withValidContactId_deletesContact() {
		ContactService service = new ContactService();
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		service.addContact(contact);
		
		service.deleteContact("12345");
		
		Contact deleteContact = service.getContact("12345");
		
		assertNull(deleteContact);
	}
}
