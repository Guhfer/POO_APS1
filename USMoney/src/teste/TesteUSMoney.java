package teste;

import model.USMoney;
import junit.framework.TestCase;

public class TesteUSMoney extends TestCase {

	public void testExecutaUSMoney() {

		USMoney test1, test2, testSoma, resultadoEsperado1, resultadoEsperado2, resultadoEsperadoSoma;
		int dol1 = 0, cents1 = 0;
		int dol2 = 0;
		int resDol1 = 0, resCents1 = 0;
		int resDol2 = 0, resCents2 = 0;
		int resDol3 = 0;

		for (int i = 0; i <= 999999; i++) {

			test1 = new USMoney(dol1, cents1);
			test2 = new USMoney(dol2);
			resultadoEsperado1 = new USMoney(resDol1, resCents1);
			resultadoEsperado2 = new USMoney(resDol3);

			assertEquals(resultadoEsperado1.toString(), test1.toString());
			assertEquals(resultadoEsperado2.toString(), test2.toString());

			testSoma = test1.plus(test2);

			resultadoEsperadoSoma = new USMoney(resDol2, resCents2);

			System.out.println("Teste da soma: " + testSoma.toString());
			System.out.println("Resultado da soma esperado: " + resultadoEsperadoSoma.toString() + "\n");

			assertEquals(resultadoEsperadoSoma.toString(), testSoma.toString());

			dol1++;
			cents1++;
			dol2++;
			resDol1++;
			resCents1++;
			resDol3++;
			resDol2 = dol1 + dol2;
			resCents2++;

		}
	}
}
