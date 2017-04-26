package dao.tests;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;

import dao.Dao;
import dao.IDao;

public class DaoAuthentificationTests {

	@Inject
	IDao idao ;
	
	/**
	 * Test l'authentification d'un conseiller dans le cas o� le conseiller rentre le bon login et le bon password
	 */
	@Test
	public void testauthentificationConseiller() {
		
		
		String login = "bourne";
		String pwd = "bourne";
		
		int id = idao.authentificationConseiller(login, pwd);
		
		Assert.assertEquals(2, id);
	}

	
	/**
	 * Test l'authentification d'un conseiller dans le cas o� le conseiller rentre le bon login et un mauvais password
	 */
	@Test
	public void testauthentificationConseiller2() {
		
		String login = "bourne";
		String pwd = "bourn";
		
		int id = idao.authentificationConseiller(login, pwd);
		
		Assert.assertEquals(0, id);
	}
	
	/**
	 * Test l'authentification d'un conseiller dans le cas o� le conseiller rentre un mauvais login 
	 */
	@Test
	public void testauthentificationConseiller3() {
	
		String login = "bourn";
		String pwd = "bourne";
		
		int id = idao.authentificationConseiller(login, pwd);
		
		Assert.assertEquals(0, id);
	}
	
	
	
	
}
