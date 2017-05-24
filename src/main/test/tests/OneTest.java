package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import HibernateDAO.ContactDAO;

public class OneTest {
	
	private ContactDAO contactDAO;
	
	@Before
	public void beforeTest(){
		contactDAO = new ContactDAO();
	}
	
	@After
	public void afterTest(){
		contactDAO = null;
	}
	
	@Test
	public void updateContactTest(){
		assertEquals("the result must be true", true, contactDAO.updateContact(35, "tester", "tester", "0000000000", "tester", "tester@gmail.com"));
	}
	
	@Test
	public void deleteContactTest(){
		assertEquals("the result must be true", true, contactDAO.deleteContact(34));
	}
	
	@Test
	public void getContactByIdTest(){
		assertEquals("the result must be ", 35, contactDAO.getContactById(35).getId());
	}
	
	@Test
	public void selectAllDataTest(){
		assertEquals("the result must be ", true, contactDAO.selectAllData() != null);
	}

}
