package codes.original;

public class Guitar {
	
	private String serialNumber, builder, model, type, topWood, backWood;
	private double price;
	
	public Guitar(String s, double pr, String b, String m, String t, String twood, String bwood){
		serialNumber = s;
		price = pr;
		builder = b;
		model = m;
		type = t;
		topWood = twood;
		backWood = bwood;
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
	
	public String getBuilder(){
		return builder;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getType(){
		return type;
	}
	
	public String getTopWood(){
		return topWood;
	}
	
	public String getBackWood(){
		return backWood;
	}
}