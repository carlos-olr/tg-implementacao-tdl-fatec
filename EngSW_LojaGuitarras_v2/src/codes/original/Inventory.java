package codes.original;

import java.util.List;
import java.util.LinkedList;

public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory(){
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String sn, double pri, Spec s){//resolucao do problema 3
		Guitar gui = new Guitar(sn, pri, s);
		guitars.add(gui);
	}
	
	public List<Guitar> search(Spec especificacaoCliente){
		List<Guitar> encontradas = new LinkedList<Guitar>();
		for(Object i: guitars){
			Guitar guitarInventory = (Guitar)i;
			if(guitarInventory.getSp().matches(especificacaoCliente)) encontradas.add(guitarInventory);
		}
		return encontradas;
	}
}
