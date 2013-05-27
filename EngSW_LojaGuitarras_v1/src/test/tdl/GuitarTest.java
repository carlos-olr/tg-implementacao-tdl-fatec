package test.tdl;

import junit.framework.Assert;

import org.junit.Test;

import codes.tdl.Guitar;

public class GuitarTest {

	@Test
	public void InstanciarGuitarTestComArgumentos() {
		Guitar guitar = new Guitar("12345abc", 8000.0, "Fender",
				"Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil");
		Assert.assertEquals("12345abc", guitar.getSerialNumber());
		Assert.assertEquals(8000.0, guitar.getPrice());
		Assert.assertEquals("Fender", guitar.getBuilder());
		Assert.assertEquals("Stratocaster", guitar.getModel());
		Assert.assertEquals("Gilmour", guitar.getType());
		Assert.assertEquals("Pau Brasil", guitar.getTopWood());
		Assert.assertEquals("Pau Brasil", guitar.getBackWood());
	}

	@Test
	public void InstanciarGuitarTest() {
		Guitar guitar = new Guitar();
		
		guitar.setSerialNumber("12345abc");
		guitar.setPrice(8000.0);
		guitar.setBuilder("Fender");
		guitar.setModel("Stratocaster");
		guitar.setType("Gilmour");
		guitar.setTopWood("Pau Brasil");
		guitar.setBackWood("Pau Brasil");
		
		Assert.assertEquals("12345abc", guitar.getSerialNumber());
		Assert.assertEquals(8000.0, guitar.getPrice());
		Assert.assertEquals("Fender", guitar.getBuilder());
		Assert.assertEquals("Stratocaster", guitar.getModel());
		Assert.assertEquals("Gilmour", guitar.getType());
		Assert.assertEquals("Pau Brasil", guitar.getTopWood());
		Assert.assertEquals("Pau Brasil", guitar.getBackWood());
	}
}
