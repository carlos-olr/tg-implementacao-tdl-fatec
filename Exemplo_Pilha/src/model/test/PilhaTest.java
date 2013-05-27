package model.test;

import java.util.List;

import model.core.Pilha;
import model.exceptions.PilhaException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Classe de Teste para a classe Pilha
 * author Carlos Oliveira
 */
public class PilhaTest {

	@Before
	public void setUp() {
		Pilha p1 = Pilha.getInstance();
		p1.getItens().clear();
	}

	/*
	 * Teste referente Regra de Negócio 1
	 */
	@Test
	public void garantirSingletonPilha() {
		Pilha p1 = Pilha.getInstance();
		Pilha p2 = Pilha.getInstance();
		Assert.assertNotNull(p1);
		Assert.assertNotNull(p2);
		Assert.assertEquals(p1, p2);
	}

	/*
	 * Teste referente Regra de Negócio 1
	 */
	@Test
	public void garantirSingletonPilhaAdicionandoItem() {
		Pilha p1 = Pilha.getInstance();
		p1.adicionarItem(new Long(1));
		Pilha p2 = Pilha.getInstance();
		p2.adicionarItem(new Long(2));
		Assert.assertNotNull(p1.getItens());
		Assert.assertNotNull(p2.getItens());
		Assert.assertEquals(p1.getItens(), p2.getItens());
	}

	/*
	 * Teste referente Regra de Negócio 2
	 */
	@Test
	public void garantirPilhaVaziaQuandoCriada() {
		Pilha p1 = Pilha.getInstance();
		Assert.assertNotNull(p1);
		Assert.assertNotNull(p1.getItens());
		Assert.assertEquals(0, p1.getItens().size());
	}

	/*
	 * Teste referente Regra de Negócio 3 e 7
	 */
	@Test
	public void garantirFailRetirarItemPilhaVazia() {
		Pilha p1 = Pilha.getInstance();
		Assert.assertEquals(0, p1.getItens().size());
		try {
			p1.removeItem();
			Assert.fail("Método deve lançar exception se a lista estiver vazia");
		} catch (Exception e) {
			Assert.assertTrue(e instanceof PilhaException);
		}
	}

	/*
	 * Teste referente Regra de Negócio 4
	 */
	@Test
	public void garantirSalvarUltimoItemRemovido() throws PilhaException {
		Pilha p1 = Pilha.getInstance();
		Long l1 = new Long(1);
		Long expected = new Long(1);
		p1.adicionarItem(l1);
		p1.removeItem();
		Assert.assertEquals(expected, p1.getUltimoItemResumido());
	}

	/*
	 * Teste referente Regra de Negócio 5
	 */
	@Test
	public void garantirAdicionarItemNaPilha() {
		Pilha p1 = Pilha.getInstance();
		Long l1 = new Long(1);
		p1.adicionarItem(l1);
		Assert.assertEquals(l1, p1.getItens().getLast());
	}

	/*
	 * Teste referente Regra de Negócio 5
	 */
	@Test
	public void garantirUltimoItemAddUltimoNaPilha() {
		Pilha p1 = Pilha.getInstance();
		Long l1 = new Long(1);
		Long l2 = new Long(2);
		Long l3 = new Long(3);
		p1.adicionarItem(l1);
		p1.adicionarItem(l2);
		p1.adicionarItem(l3);
		Assert.assertEquals(l3, p1.getItens().getLast());
	}


	/*
	 * Teste referente Regra de Negócio 6
	 */
	@Test
	public void resgatarTodosItensPilha() {
		Pilha p = Pilha.getInstance();
		Long l1 = new Long(1);
		Long l2 = new Long(2);
		p.adicionarItem(l1);
		p.adicionarItem(l2);
		List<Long> itens = p.getItens();
		Assert.assertEquals(l1, itens.get(0));
		Assert.assertEquals(l2, itens.get(1));
	}
}
