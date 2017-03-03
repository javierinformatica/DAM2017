package clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calcula;

	@Before
	public void inicializa() {
		calcula = new Calculadora();

	}

	@Test
	public void testSuma() {
		int k = 0;
			for (int x=1, y = 0; y < 100; y++) {
				k++;
				assertEquals(k, calcula.suma(x,y));
	    }
	}
	@Test
	public void testResta() {
		int k = 2;
			for (int x=1, y = 0; y < 102; y++) {
				k--;
				assertEquals(k, calcula.resta(x,y));
	    }
	}
	@Test
	public void testMulti() {
		int x=1,k = 0;
		for	(int y = 0; y < 101; y++) {
			k=x*y;
			assertEquals(k, calcula.multi(x,y));
	    }
	}
	@Test
	public void testDivi() {
		int k = 0, x=1;
			for (int y = 0; y < 101; y++) {
				if(y!=0)k=x/y;
				else k=0;
				assertEquals(k, calcula.divi(x,y));
				
	    }
	}
	@Test
	public void testSumaReves() {
		int k = 0;
			for (int y=1, x = 0; x < 100; x++) {
				k++;
				assertEquals(k, calcula.suma(x,y));
	    }
	}
	@Test
	public void testRestaReves() {
		int k = -2;
			for (int y=1, x = 0; x < 102; x++) {
				k++;
				assertEquals(k, calcula.resta(x,y));
	    }
	}
	@Test
	public void testMultiReves() {
		int k = -1;
		for	(int y=1, x = 0; x < 101; x++) {
			k++;
				assertEquals(k, calcula.multi(x,y));
	    }
	}
	@Test
	public void testDiviReves() {
		int k = -1;
			for (int y=1, x = 0; x < 101; x++) {
				k++;
				assertEquals(k, calcula.divi(x,y));
	    }
	}
}
