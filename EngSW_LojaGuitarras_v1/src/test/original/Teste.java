package test.original;

import java.util.List;

import codes.original.Guitar;
import codes.original.Inventory;



public class Teste {

	public static void main(String[] args) {
		
		Inventory inv = new Inventory();
		inv.addGuitar("12345abc", 8000.0, "Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil");
	    inv.addGuitar("12341hgt", 6500.0, "Gibson", "Les Paul" , "Jimmy Page", "Pau Brasil", "Pau Brasil");
	    inv.addGuitar("547hjt", 5500.0, "Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil");
	    
	    
		Guitar meuClienteQuer = new Guitar("", 0, "Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil");
		
		List guitarrasEncontradas = inv.search(meuClienteQuer);
		
		if(!guitarrasEncontradas.isEmpty()){
			for(Object i: guitarrasEncontradas){
				Guitar guitar = (Guitar)i;
				System.out.println("Encontramos a guitarra com numero de serie: "+guitar.getSerialNumber());
				System.out.println("Ela custa: "+guitar.getPrice()+" reais");
				System.out.println("Sua marca e: "+guitar.getBuilder());
				System.out.println("Seu modelo e: "+guitar.getModel());
				System.out.println("Seu tipo e: "+guitar.getType());
				System.out.println("Suas madeiras da frente e costas sao: "+guitar.getTopWood()+" e "+guitar.getBackWood());
				System.out.println("-------------");
			}
		} else {
			System.out.println("Nao foi encontrada nenhuma guitarra");
		}
		
	}
	
	
}
