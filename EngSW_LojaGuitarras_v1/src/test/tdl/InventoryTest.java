package test.tdl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import codes.tdl.Guitar;
import codes.tdl.Inventory;

public class InventoryTest {

	private Guitar guitar;
	private Inventory inventory;

	@Before
	public void setUp() {
		this.inventory = new Inventory();
		this.guitar = new Guitar("V", 8, "V", "V", "V", "V", "V");
		this.inventory.addGuitar(this.guitar);
	}

	@Test
	public void adicionarGuitarraSucessoTest() {
		Guitar guitar = new Guitar();
		Inventory inventory = new Inventory();
		inventory.addGuitar(guitar);
		Assert.assertEquals(1, inventory.getGuitars().size());
		Assert.assertEquals(guitar, inventory.getGuitars().get(0));
	}

	@Test
	public void adicionarGuitarraFalhaTest() {
		Inventory inventory = new Inventory();
		inventory.addGuitar(null);
		Assert.assertEquals(0, inventory.getGuitars().size());
	}

	@Test
	public void buscarGuitarCaso1() {
		Guitar guitar = new Guitar("1", 1, "F", "F", "F", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso2() {
		Guitar guitar = new Guitar("2", 1, "F", "F", "F", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso3() {
		Guitar guitar = new Guitar("3", 1, "F", "F", "F", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso4() {
		Guitar guitar = new Guitar("4", 1, "F", "F", "F", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso5() {
		Guitar guitar = new Guitar("5", 1, "F", "F", "V", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso6() {
		Guitar guitar = new Guitar("6", 1, "F", "F", "V", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso7() {
		Guitar guitar = new Guitar("7", 1, "F", "F", "V", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso8() {
		Guitar guitar = new Guitar("8", 1, "F", "F", "V", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso9() {
		Guitar guitar = new Guitar("9", 1, "F", "V", "F", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso10() {
		Guitar guitar = new Guitar("10", 1, "F", "V", "F", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso11() {
		Guitar guitar = new Guitar("11", 1, "F", "V", "F", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso12() {
		Guitar guitar = new Guitar("12", 1, "F", "V", "F", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso13() {
		Guitar guitar = new Guitar("13", 1, "F", "V", "V", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso14() {
		Guitar guitar = new Guitar("14", 1, "F", "V", "V", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso15() {
		Guitar guitar = new Guitar("15", 1, "F", "V", "V", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso16() {
		Guitar guitar = new Guitar("16", 1, "F", "V", "V", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso17() {
		Guitar guitar = new Guitar("17", 1, "V", "F", "F", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso18() {
		Guitar guitar = new Guitar("18", 1, "V", "F", "F", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso19() {
		Guitar guitar = new Guitar("19", 1, "V", "F", "F", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso20() {
		Guitar guitar = new Guitar("20", 1, "V", "F", "F", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso21() {
		Guitar guitar = new Guitar("21", 1, "V", "F", "V", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso22() {
		Guitar guitar = new Guitar("22", 1, "V", "F", "V", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso23() {
		Guitar guitar = new Guitar("23", 1, "V", "F", "V", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso24() {
		Guitar guitar = new Guitar("24", 1, "V", "F", "V", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso25() {
		Guitar guitar = new Guitar("25", 1, "V", "V", "F", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso26() {
		Guitar guitar = new Guitar("26", 1, "V", "V", "F", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso27() {
		Guitar guitar = new Guitar("27", 1, "V", "V", "F", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso28() {
		Guitar guitar = new Guitar("28", 1, "V", "V", "F", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso29() {
		Guitar guitar = new Guitar("29", 1, "V", "V", "V", "F", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso30() {
		Guitar guitar = new Guitar("30", 1, "V", "V", "V", "F", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso31() {
		Guitar guitar = new Guitar("31", 1, "V", "V", "V", "V", "F");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(0, resultado.size());
	}

	@Test
	public void buscarGuitarCaso32() {
		Guitar guitar = new Guitar("32", 1, "V", "V", "V", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(1, resultado.size());
	}

	@Test
	public void buscarGuitarCaso33() {
		this.guitar = new Guitar("VV", 9, "V", "V", "V", "V", "V");
		this.inventory.addGuitar(this.guitar);
		Guitar guitar = new Guitar("33", 1, "V", "V", "V", "V", "V");
		List<Guitar> resultado = this.inventory.search(guitar);
		Assert.assertEquals(2, resultado.size());
	}

}
