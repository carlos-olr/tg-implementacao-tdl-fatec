package test.tdl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import core.tdl.Estoque;
import core.tdl.EstoqueFacade;
import core.tdl.Flor;

public class EstoqueFacadeTest {

	@Test
	public void cadastrarFlorFalha() {
		EstoqueFacade facade = new EstoqueFacade();
		Flor cadastrada = facade.cadastrarFlor(null, null, 0);
		Assert.assertEquals(null, cadastrada);
		int quantidade = Estoque.getInstancia().getListaFlores().size();
		Assert.assertEquals(0, quantidade);
	}

	@Test
	public void cadastrarFlorSucesso() {
		EstoqueFacade facade = new EstoqueFacade();
		Flor cadastrada = facade.cadastrarFlor("tipo", "cor", 20);
		int quantidade = Estoque.getInstancia().getListaFlores().size();
		Assert.assertEquals(1, quantidade);
		Flor florLista = (Flor) Estoque.getInstancia().getListaFlores().get(0);
		Assert.assertEquals(cadastrada, florLista);
	}

	@Test
	public void buscarFloresCaso1() {
		EstoqueFacade facade = new EstoqueFacade();
		List<Flor> encontradas = facade.buscarFlores("tipo errado",
				"cor errada");
		Assert.assertEquals(0, encontradas.size());
	}

	@Test
	public void buscarFloresCaso2() {
		EstoqueFacade facade = new EstoqueFacade();
		List<Flor> encontradas = facade.buscarFlores("tipo errado", "cor");
		Assert.assertEquals(0, encontradas.size());
	}

	@Test
	public void buscarFloresCaso3() {
		EstoqueFacade facade = new EstoqueFacade();
		List<Flor> encontradas = facade.buscarFlores("tipo", "cor errada");
		Assert.assertEquals(0, encontradas.size());
	}

	@Test
	public void buscarFloresCaso4() {
		EstoqueFacade facade = new EstoqueFacade();
		List<Flor> encontradas = facade.buscarFlores("tipo", "cor");
		Assert.assertEquals(1, encontradas.size());
	}

	@Test
	public void buscarFloresCaso5() {
		EstoqueFacade facade = new EstoqueFacade();
		facade.cadastrarFlor("tipo", "cor", 30);
		List<Flor> encontradas = facade.buscarFlores("tipo", "cor");
		Assert.assertEquals(2, encontradas.size());
	}

}
