package Elipse;

public class Principal {
	
	public static void main(String[] args) {
	
		Elipse elipse = new Elipse(5, 15, 3.14);
		
		String resultado = String.format("%.2f", elipse.getAreaElipse());
			
		System.out.println("A area da elipse é de: "+ resultado);
		
	}

}
