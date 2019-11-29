package modele.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import modele.Client;

public class Tests {
	
	@Test
	public void testCreationClientPositif () {
		// GIVEN : pr�parer les donn�es du test
		String nom = "Dupont";
		String adresse = "Paris 12";
		
		// WHEN : ex�cuter la fonction test�e
		Client c = new Client (nom, adresse);
		
		// THEN : v�rifier la conformit� du r�sultat par rapport � attente du test
		assertNotNull(c);
		assertEquals(nom, c.getNom());
		assertEquals(adresse, c.getAdresse());
	}
	
	@Test
	public void testCreationClientNegatif () {
		// GIVEN : pr�parer les donn�es du test
		String nom = null;
		String adresse = "Paris 12";
		
		// WHEN/THEN
		assertThrows(IllegalArgumentException.class, ()->{Client c = new Client (nom, adresse);});
		assertThrows(IllegalArgumentException.class, ()->{new Client ("", adresse);});
		assertThrows(IllegalArgumentException.class, ()->{new Client ("    ", adresse);});
	}

}
