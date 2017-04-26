package dao.tests;

import java.util.Collection;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;

import dao.Dao;
import dao.IDao;
import metier.Client;
import metier.Compte;

public class DaoListerCompteClientTests {

	@Inject
	IDao idao ;
	/**
	 *  test la méthode listercompteclient d'un client dans le cas ou le client possède deux comptes
	 */
	@Test
	public void listerCompteClientTest() {
	
		
		Client c = new Client();
		c.setIdClient(2);//Client dont l'idClient est de 2 : il a 2 comptes en BDD
		
		Collection<Compte> col1 = idao.listerCompteClient(c); //Collection de clients particulier pour un conseiller
		
		Assert.assertEquals(2, col1.size()); //Regarde si la taille de la collection de comptes du client 2 est bien de 2
		
	}
	
	
	/**
	 * test la méthode listercompteclient d'un client dans le cas ou le client possède un seul compte
	 */
		@Test
		public void listerCompteClientTest2() {
			
			
			Client c = new Client();
			c.setIdClient(1);//Client dont l'idClient est de 1 : il a 1 compte en BDD
			
			Collection<Compte> col1 = idao.listerCompteClient(c); //Collection de clients particulier pour un conseiller
			
			Assert.assertEquals(1, col1.size()); //Regarde si la taille de la collection de comptes du client 2 est bien de 2
			
		}

		/**
		 * test la méthode listercompteclient d'un client dans le cas ou le client ne possède pas de compte
		 */
				@Test
				public void listerCompteClientTest3() {
					
					IDao idao = new Dao();		
					Client c = new Client();
					c.setIdClient(3);//Client dont l'idClient est de 3 : il n'a pas de compte en BDD
					
					Collection<Compte> col1 = idao.listerCompteClient(c); //Collection de clients particulier pour un conseiller
					
					Assert.assertEquals(0, col1.size()); //Regarde si la taille de la collection de comptes du client 2 est bien de 2
				}
		
				
				
}
