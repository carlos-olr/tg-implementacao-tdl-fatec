package codes.original;

public class Spec {

	private String builder, model, type, topWood, backWood;
	private int numStrings;
	private boolean newGuitar;

	public Spec(String b, String m, String t, String tw, String bw, int ns,
			boolean ng) {
		builder = b;
		model = m;
		type = t;
		topWood = tw;
		backWood = bw;
		numStrings = ns;
		newGuitar = ng;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getTopWood() {
		return topWood;
	}

	public String getBackWood() {
		return backWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public boolean getNewGuitar() {
		return newGuitar;
	}

	public boolean matches(Spec specCliente) {// resolucao do problema 2
		if (!builder.equals(specCliente.builder))
			return false;
		if (!model.equals(specCliente.model))
			return false;
		if (!type.equals(specCliente.type))
			return false;
		if (!topWood.equals(specCliente.topWood))
			return false;
		if (!backWood.equals(specCliente.backWood))
			return false;
		if (numStrings != specCliente.numStrings)
			return false;
		if (newGuitar != specCliente.newGuitar)
			return false;
		return true;
	}
}
