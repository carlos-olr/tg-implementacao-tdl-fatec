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

	public List<Guitar> search(Spec spec) {
		List<Guitar> result = new ArrayList<Guitar>();
		for (Guitar guitar : this.guitars) {
			if (guitar.getSpecification().matches(spec)) {
				result.add(guitar);
			}
		}
		return result;
	}

}
