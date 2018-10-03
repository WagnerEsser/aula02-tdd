package br.com.academiadev;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiadev.Exercicio01;

public class Exercicio01Test {

	@Test
	public void calcularEstoqueMedio01() {
		Exercicio01 teste01 = new Exercicio01();
		double media01 = teste01.calculaMedia(10, 20);
		
		/* Assert.assertEquals(valor_esperado, valor_a_testar, margem_erro) */
		Assert.assertEquals(15, media01, 0);
	}
	
	@Test
	public void calcularEstoqueMedio02() {
		Exercicio01 teste02 = new Exercicio01();
		double media02 = teste02.calculaMedia(5, 10);
		
		/* Assert.assertEquals(valor_esperado, valor_a_testar, margem_erro) */
		Assert.assertEquals(7.5, media02, 0);
	}
	
}
