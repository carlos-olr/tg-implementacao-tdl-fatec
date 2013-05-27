package test.tdl;

import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import codes.tdl.Guitar;
import codes.tdl.Inventory;
import codes.tdl.Spec;

public class InventoryTest {

	private Guitar guitar = EasyMock.createMock(Guitar.class);
	private Spec spec = EasyMock.createMock(Spec.class);
	private Spec specBusca = EasyMock.createMock(Spec.class);
	private Inventory inventory = new Inventory();

	@Before
	public void setUp() {
		this.inventory.getGuitars().clear();
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
	public void naoEncontraGuitarTest() {
		EasyMock.expect(this.guitar.getSpecification()).andReturn(spec);
		EasyMock.expect(this.spec.matches(this.specBusca)).andReturn(false);
		EasyMock.replay(this.guitar, this.spec);
		List<Guitar> result = this.inventory.search(this.specBusca);
		Assert.assertEquals(0, result.size());
	}

	@Test
	public void encontraUmaGuitarTest() {
		EasyMock.expect(this.guitar.getSpecification()).andReturn(spec);
		EasyMock.expect(this.spec.matches(this.specBusca)).andReturn(true);
		EasyMock.replay(this.guitar, this.spec);
		List<Guitar> result = this.inventory.search(this.specBusca);
		Assert.assertEquals(1, result.size());
	}

	@Test
	public void encontraDuasGuitarTest() {
		this.inventory.addGuitar(this.guitar);
		EasyMock.expect(this.guitar.getSpecification()).andReturn(spec)
				.times(2);
		EasyMock.expect(this.spec.matches(this.specBusca)).andReturn(true)
				.times(2);
		EasyMock.replay(this.guitar, this.spec);
		List<Guitar> result = this.inventory.search(this.specBusca);
		Assert.assertEquals(2, result.size());
	}

}
