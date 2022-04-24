package testdice;

import static org.junit.Assert.*;

import org.junit.Test;

public class testunitaire {

	
	
	@Test
	
	public void test() {
		salle  s=new salle();
		administrateur admin =new administrateur();
		String ajoutreussi =admin.ajoutdesalle(s);	
		assertEquals(ajoutreussi,"la salle numero "+s.numsalle+" ajout reussi ");
		
		
		
	}
	@Test
	 public void testsuppression()
	 {salle  s=new salle();
		administrateur admin =new administrateur();
		String suppressionreussi =admin.suppressiondesalle(s);
		
		assertEquals(suppressionreussi,"la salle numero "+s.numsalle+" suppression reussi ");
		
	 }

}
