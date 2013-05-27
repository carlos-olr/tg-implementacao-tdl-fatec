package padrao;

public class Test {
	
	static Singleton s;
	
	public static void main(String[] args) {
		
		//Singleton s = new Singleton(); nao e possivel fazer isso
		
		
		s = s.getInstance();
		
		System.out.println(s);
		
		s = s.getInstance();
		
		System.out.println(s);
		
		s = s.getInstance();
		
		System.out.println(s);
		
		//veja que ele imprime sempre o mesmo objeto
		
	}

}
