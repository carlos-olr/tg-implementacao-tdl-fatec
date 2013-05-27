package codes.original;
import java.util.List;
import java.util.LinkedList;

public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory(){
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String sn, double pri, String bu, String mo, String ty, String tw, String bw){
		Guitar gui = new Guitar(sn, pri, bu, mo, ty, tw, bw);
		guitars.add(gui);
	}
	
	public List<Guitar> search(Guitar g){
		List<Guitar> encontradas = new LinkedList<Guitar>();
		for(Object i: guitars){
			Guitar guitarInventory = (Guitar)i;
			if(!g.getBuilder().equals(guitarInventory.getBuilder())) continue;
			if(!g.getModel().equals(guitarInventory.getModel())) continue;
			if(!g.getType().equals(guitarInventory.getType())) continue;
			if(!g.getTopWood().equals(guitarInventory.getTopWood())) continue;
			if(!g.getBackWood().equals(guitarInventory.getBackWood())) continue;
			encontradas.add(guitarInventory);
		}
		return encontradas;
	}
}
