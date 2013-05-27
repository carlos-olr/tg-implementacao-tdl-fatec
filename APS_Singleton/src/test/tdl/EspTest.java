package test.tdl;

import junit.framework.Assert;

import org.junit.Test;

import core.tdl.Esp;

public class EspTest {

	@Test
	public void criarEspComConstrutotVazioTest() {
		Esp especializacao = new Esp();
		Assert.assertNotNull(especializacao);
		Assert.assertNull(especializacao.getCor());
		Assert.assertNull(especializacao.getTipo());
	}

	@Test
	public void criarEspComConstrutorCompletoTeste() {
		Esp especializacao = new Esp("azul", "tipo");
		Assert.assertEquals("azul", especializacao.getCor());
		Assert.assertEquals("tipo", especializacao.getTipo());
	}

	@Test
	public void setEGetAtributosEspTest() {
		Esp especializacao = new Esp("azul", "tipo");
		especializacao.setCor("vermelho");
		especializacao.setTipo("tipo2");
		Assert.assertEquals("vermelho", especializacao.getCor());
		Assert.assertEquals("tipo2", especializacao.getTipo());
	}

	@Test
	public void compararRetornaFalse() {
		Esp esp1 = new Esp("azul","tipo1");
		Esp esp2 = new Esp("vermelho","tipo1");
		Assert.assertFalse(esp1.comparar(esp2));
	}

	@Test
	public void compararRetornaTrue() {
		Esp esp1 = new Esp("azul","tipo1");
		Esp esp2 = new Esp("azul","tipo1");
		Assert.assertTrue(esp1.comparar(esp2));
	}
}
