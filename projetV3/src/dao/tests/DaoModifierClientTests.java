package dao.tests;

import javax.inject.Inject;

import org.junit.Test;

import dao.IDao;
import metier.Adresse;
import metier.Client;

public class DaoModifierClientTests {
	@Inject
	IDao idao ;
	/**
	 * Test la modification d'un client
	 */
	@Test
	public void modificationClientTest() {
		
		Client c= new Client();
		c.setIdClient(13);
		String nom = "a";
		String prenom = "b";
		Adresse a = new Adresse("rue a", 69100, "villeurbanne");
		String email ="a.b@gmail.com";
		
		idao.modifierClient(c, nom, prenom, a, email);
		
		
	}

}
