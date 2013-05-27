package test.tradicional;
import java.util.List;

import core.tradicional.Esp;
import core.tradicional.Facade;


public class Teste {
	
	public static void main(String[] args) {
		
		Facade f = new Facade();
		f.initializeInventory();
		f.printSearch(new Esp("Ipe", "Rosa"));
		
		
	}

}
