package modele.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modele.Banque;
import modele.Client;
import modele.ClientInexistantException;
import modele.Compte;

public class TestsCreationCompte {
	
	@Test
	public void testCreationComptePositif () {
		// GIVEN : pr�parer les donn�es du test
		Banque banque = new Banque();
		Client dupont = banque.ajouterClient("Dupont", "Patis");
		
		// WHEN : ex�cuter la fonction test�e
		Compte c = banque.creerCompte(dupont.getId());
		
		// THEN : v�rifier la conformit� du r�sultat par rapport � attente du test
		assertNotNull(c);
		assertEquals(0, c.getSolde());
		assertEquals("Dupont", c.getProprietaire().getNom());
	}
	
	@Test
	public void testCreationCompteNegatif () {
		// GIVEN : pr�parer les donn�es du test
		Banque banque = new Banque();						
		
		// WHEN/THEN
		assertThrows(ClientInexistantException.class, ()->
			{
				banque.creerCompte(102);
			}
		);
	}

}
