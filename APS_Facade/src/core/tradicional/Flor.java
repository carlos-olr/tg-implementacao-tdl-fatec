package core.tradicional;

public class Flor {
	
	private String id;
	private double preco;
	private Esp e;
	
	public Flor(String i, double p, Esp es){
		id = i;
		preco = p;
		e = es;
	}
	
	public Flor(String i){
		id = i;
	}
	
	public String getId(){
		return id;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public Esp getE(){
		return e;
	}

}
