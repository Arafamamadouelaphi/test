package testdice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

public class testadminsalle {
@Mock
salle  s=new salle();
	@Test
	public void test() {
		administrateur admin =new administrateur();
		String ajoutreussi =admin.ajoutdesalle(s);	
		assertEquals(ajoutreussi,"la salle numero "+s.numsalle+" ajout reussi ");
		
		
		
	}
	@Test
	 public void testsuppression()
	 {
		administrateur admin =new administrateur();
		String suppressionreussi =admin.suppressiondesalle(s);
		
		assertEquals(suppressionreussi,"la salle numero "+s.numsalle+" suppression reussi ");
		
	 }
}
