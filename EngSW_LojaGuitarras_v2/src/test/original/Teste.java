package test.original;

import java.util.List;

import codes.original.Guitar;
import codes.original.Inventory;
import codes.original.Spec;

public class Teste {

	public static void main(String[] args) {

		Inventory inv = new Inventory();
		inv.addGuitar("12345abc", 8000.0, new Spec("Fender", "Stratocaster",
				"Gilmour", "Pau Brasil", "Pau Brasil", 6, true));
		inv.addGuitar("12341hgt", 6500.0, new Spec("Gibson", "Les Paul",
				"Jimmy Page", "Pau Brasil", "Pau Brasil", 6, true));
		inv.addGuitar("547hjt", 5500.0, new Spec("Fender", "Stratocaster",
				"Gilmour", "Pau Brasil", "Pau Brasil", 6, false));

		Spec meuClienteQuer = new Spec("Fender", "Stratocaster", "Gilmour",
				"Pau Brasil", "Pau Brasil", 6, false);

		List guitarrasEncontradas = inv.search(meuClienteQuer);

		if (!guitarrasEncontradas.isEmpty()) {
			for (Object i : guitarrasEncontradas) {
				Guitar guitar = (Guitar) i;
				System.out
						.println("Encontramos a guitarra com numero de serie: "
								+ guitar.getSerialNumber());
				System.out
						.println("Ela custa: " + guitar.getPrice() + " reais");
				System.out.println("Sua marca e: "
						+ guitar.getSp().getBuilder());
				System.out
						.println("Seu modelo e: " + guitar.getSp().getModel());
				System.out.println("Seu tipo e: " + guitar.getSp().getType());
				System.out.println("Suas madeiras da frente e costas sao: "
						+ guitar.getSp().getTopWood() + " e "
						+ guitar.getSp().getBackWood());
				System.out.println("Ela tem: " + guitar.getSp().getNumStrings()
						+ " cordas");
				if (guitar.getSp().getNewGuitar()) {
					System.out.println("Esta guitarra e nova.");
				} else {
					System.out.println("Guitarra usada.");
				}
				System.out.println("-------------");
			}
		} else {
			System.out.println("Nao foi encontrada nenhuma guitarra");
		}

	}

}
