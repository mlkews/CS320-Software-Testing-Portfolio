package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	public void testConstructor_withValidValues_createsContact() {
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		assertEquals("12345", contact.getContactId());
		assertEquals("John", contact.getFirstName());
		assertEquals("Smith", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main Street", contact.getAddress());
	}
	
	@Test
	public void testConstructor_withLongContactId_throwsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345678901",
					"John",
					"Smith",
					"1234567890",
					"123 Main Street");
		});
	}

	@Test
	public void testConstructor_withNullContactId_throwsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
				null,
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		});
	}
	
	@Test
	public void testConstructor_withLongFirstName_throwsIllegalArgumentExc() {
	
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"Christopher",
					"Smith",
					"1234567890",
					"123 Main Street");
		});
	}
	
	@Test
	public void testConstructor_withNullFirstName_throwsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					null,
					"Smith",
					"1234567890",
					"123 Main Street");
		});
	}
	
	@Test
	public void testConstructor_withLongLastName_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Christopher",
					"1234567890",
					"123 Main Street");
		});
	}
	
	@Test
	public void testConstructor_withNullLastName_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					null,
					"1234567890",
					"123 Main Street");
		});
	}

	@Test
	public void testConstructor_withInvalidPhone_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					"123456789",
					"123 Main Street");
		});
	}

	@Test
	public void testConstructor_withNullPhone_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					null,
					"123 Main Street");
		});
	}
	
	@Test
	public void testConstructor_withLongAddress_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					"1234567890",
					"1234567890123456789012345678901");
		});
	}
	
	@Test
	public void testConstructor_withNullAddress_throwsIllegalArgumentException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					"1234567890",
					null);
		});
	}

	@Test
	public void testSetFirstName_withValidName_updatedFirstName() {
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
			
		contact.setFirstName("Jane");
		
		assertEquals("Jane", contact.getFirstName());
	}

	@Test
	public void testSetLastName_withValidName_updatedLastName() {
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		contact.setLastName("Jones");
		
		assertEquals("Jones", contact.getLastName());
	}

	@Test
	public void testSetPhone_withValidPhone_updatedPhone() {
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		contact.setPhone("0987654321");
		
		assertEquals("0987654321", contact.getPhone());

	}

	@Test
	public void testSetAddress_withValidAddress_updatedAddress() {
		
		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		contact.setAddress("456 Oak Avenue");
		
		assertEquals("456 Oak Avenue", contact.getAddress());
	}
	
	@Test
	public void testEquals_withSamevalues_retunrsTrue() {
		Contact contact1 = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		Contact contact2 = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
		
		assertEquals(contact1, contact2);
	}
	
	@Test
	public void testHashCode_withSameValues_returnSameHashCode() {
		Contact contact1 = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
				
		Contact contact2 = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");
				
		assertEquals(contact1.hashCode(), contact2.hashCode());
	}
	
}