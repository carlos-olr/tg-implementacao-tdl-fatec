package test.tdl;

import junit.framework.Assert;

import org.junit.Test;

import codes.tdl.Spec;

@SuppressWarnings("static-access")
public class SpecTest {

	private static Spec spec = new Spec("V", "V", "V", "V", "V", 1);

	@Test
	public void InstanciarSpecComArgumento() {
		Spec spec = new Spec("A", "B", "C", "D", "E", 1);

		Assert.assertEquals("A", spec.getBuilder());
		Assert.assertEquals("B", spec.getModel());
		Assert.assertEquals("C", spec.getType());
		Assert.assertEquals("D", spec.getTopWood());
		Assert.assertEquals("E", spec.getBackWood());
		Assert.assertEquals(1, spec.getNumStrings());
	}

	@Test
	public void InstanciarSpecSemArgumento() {
		Spec spec = new Spec();

		spec.setBuilder("A");
		spec.setModel("B");
		spec.setType("C");
		spec.setTopWood("D");
		spec.setBackWood("E");
		spec.setNumStrings(1);

		Assert.assertEquals("A", spec.getBuilder());
		Assert.assertEquals("B", spec.getModel());
		Assert.assertEquals("C", spec.getType());
		Assert.assertEquals("D", spec.getTopWood());
		Assert.assertEquals("E", spec.getBackWood());
		Assert.assertEquals(1, spec.getNumStrings());
	}

	
	@Test
	public void buscarSpecCaso1() {
		Spec specAComparar = new Spec("F", "F", "F", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso2() {
		Spec specAComparar = new Spec("F", "F", "F", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso3() {
		Spec specAComparar = new Spec("F", "F", "F", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso4() {
		Spec specAComparar = new Spec("F", "F", "F", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso5() {
		Spec specAComparar = new Spec("F", "F", "F", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso6() {
		Spec specAComparar = new Spec("F", "F", "F", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso7() {
		Spec specAComparar = new Spec("F", "F", "F", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso8() {
		Spec specAComparar = new Spec("F", "F", "F", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso9() {
		Spec specAComparar = new Spec("F", "F", "V", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso10() {
		Spec specAComparar = new Spec("F", "F", "V", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso11() {
		Spec specAComparar = new Spec("F", "F", "V", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso12() {
		Spec specAComparar = new Spec("F", "F", "V", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso13() {
		Spec specAComparar = new Spec("F", "F", "V", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso14() {
		Spec specAComparar = new Spec("F", "F", "V", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso15() {
		Spec specAComparar = new Spec("F", "F", "V", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso16() {
		Spec specAComparar = new Spec("F", "F", "V", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso17() {
		Spec specAComparar = new Spec("F", "V", "F", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso18() {
		Spec specAComparar = new Spec("F", "V", "F", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso19() {
		Spec specAComparar = new Spec("F", "V", "F", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso20() {
		Spec specAComparar = new Spec("F", "V", "F", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso21() {
		Spec specAComparar = new Spec("F", "V", "F", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso22() {
		Spec specAComparar = new Spec("F", "V", "F", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso23() {
		Spec specAComparar = new Spec("F", "V", "F", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso24() {
		Spec specAComparar = new Spec("F", "V", "F", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso25() {
		Spec specAComparar = new Spec("F", "V", "V", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso26() {
		Spec specAComparar = new Spec("F", "V", "V", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso27() {
		Spec specAComparar = new Spec("F", "V", "V", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso28() {
		Spec specAComparar = new Spec("F", "V", "V", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso29() {
		Spec specAComparar = new Spec("F", "V", "V", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso30() {
		Spec specAComparar = new Spec("F", "V", "V", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso31() {
		Spec specAComparar = new Spec("F", "V", "V", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso32() {
		Spec specAComparar = new Spec("F", "V", "V", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso33() {
		Spec specAComparar = new Spec("V", "F", "F", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso34() {
		Spec specAComparar = new Spec("V", "F", "F", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso35() {
		Spec specAComparar = new Spec("V", "F", "F", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso36() {
		Spec specAComparar = new Spec("V", "F", "F", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso37() {
		Spec specAComparar = new Spec("V", "F", "F", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso38() {
		Spec specAComparar = new Spec("V", "F", "F", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso39() {
		Spec specAComparar = new Spec("V", "F", "F", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso40() {
		Spec specAComparar = new Spec("V", "F", "F", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso41() {
		Spec specAComparar = new Spec("V", "F", "V", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso42() {
		Spec specAComparar = new Spec("V", "F", "V", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso43() {
		Spec specAComparar = new Spec("V", "F", "V", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso44() {
		Spec specAComparar = new Spec("V", "F", "V", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso45() {
		Spec specAComparar = new Spec("V", "F", "V", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso46() {
		Spec specAComparar = new Spec("V", "F", "V", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso47() {
		Spec specAComparar = new Spec("V", "F", "V", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso48() {
		Spec specAComparar = new Spec("V", "F", "V", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso49() {
		Spec specAComparar = new Spec("V", "V", "F", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso50() {
		Spec specAComparar = new Spec("V", "V", "F", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso51() {
		Spec specAComparar = new Spec("V", "V", "F", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso52() {
		Spec specAComparar = new Spec("V", "V", "F", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso53() {
		Spec specAComparar = new Spec("V", "V", "F", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso54() {
		Spec specAComparar = new Spec("V", "V", "F", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso55() {
		Spec specAComparar = new Spec("V", "V", "F", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso56() {
		Spec specAComparar = new Spec("V", "V", "F", "V", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso57() {
		Spec specAComparar = new Spec("V", "V", "V", "F", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso58() {
		Spec specAComparar = new Spec("V", "V", "V", "F", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso59() {
		Spec specAComparar = new Spec("V", "V", "V", "F", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso60() {
		Spec specAComparar = new Spec("V", "V", "V", "F", "V", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso61() {
		Spec specAComparar = new Spec("V", "V", "V", "V", "F", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso62() {
		Spec specAComparar = new Spec("V", "V", "V", "V", "F", 1);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso63() {
		Spec specAComparar = new Spec("V", "V", "V", "V", "V", 0);
		Assert.assertFalse(this.spec.matches(specAComparar));
	}

	@Test
	public void buscarSpecCaso64() {
		Spec specAComparar = new Spec("V", "V", "V", "V", "V", 1);
		Assert.assertTrue(this.spec.matches(specAComparar));
	}

}
