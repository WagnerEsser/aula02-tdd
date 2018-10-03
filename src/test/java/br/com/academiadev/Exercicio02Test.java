package br.com.academiadev;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiadev.Exercicio02;

public class Exercicio02Test {
	
	@Test
	public void ConversorDolarReal01() {
		Exercicio02 teste01 = new Exercicio02();
		double real01 = teste01.calculaCotacao(5, 2);
		
		/* Assert.assertEquals(valor_esperado, valor_a_testar, margem_erro) */
		Assert.assertEquals(10, real01, 0);
	}
	
	@Test
	public void ConversorDolarReal02() {
		Exercicio02 teste02 = new Exercicio02();
		double real02 = teste02.calculaCotacao(5, 2);
		
		/* Assert.assertEquals(valor_esperado, valor_a_testar, margem_erro) */
		Assert.assertEquals(10, real02, 0);
	}
}
