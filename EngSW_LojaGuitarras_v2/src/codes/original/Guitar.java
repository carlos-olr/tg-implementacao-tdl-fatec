package codes.original;

public class Guitar {
	
	private String serialNumber;
	private double price;
	private Spec sp;
	
	public Guitar(String s, double pr, Spec spe){
		serialNumber = s;
		price = pr;
		sp = spe;
		
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double p){
		price = p;
	}
	
	public Spec getSp(){
		return sp;
	}
	
	
}