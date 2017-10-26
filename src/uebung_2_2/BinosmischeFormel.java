package uebung_2_2;

public class BinosmischeFormel {

	public static void main(String[] args) {
		double a=8;
		double b=3;
		
		double linkeseite= (a+b)*(a+b);
		double rechteseite= (a*a)+2*a*b+(b*b);
		
		System.out.println("linke Seite: " + linkeseite);
		System.out.println("rechte Seite: "+ rechteseite);
				
	}

}
