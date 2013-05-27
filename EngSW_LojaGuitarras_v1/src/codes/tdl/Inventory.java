package codes.tdl;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars = new ArrayList<Guitar>();

	public void addGuitar(Guitar guitar) {
		if (guitar != null) {
			this.guitars.add(guitar);
		}
	}

	public List<Guitar> getGuitars() {
		return this.guitars;
	}

	public List<Guitar> search(Guitar guitarSearch) {
		List<Guitar> resultado = new ArrayList<Guitar>();
		for (Guitar guitar : this.getGuitars()) {
			if (!guitar.getBuilder().equals(guitarSearch.getBuilder()))
				continue;
			if (!guitar.getModel().equals(guitarSearch.getModel()))
				continue;
			if (!guitar.getType().equals(guitarSearch.getType()))
				continue;
			if (!guitar.getTopWood().equals(guitarSearch.getTopWood()))
				continue;
			if (!guitar.getBackWood().equals(guitarSearch.getBackWood()))
				continue;
			resultado.add(guitar);
		}
		return resultado;
	}

}
