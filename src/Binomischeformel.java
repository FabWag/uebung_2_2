
public class Binomischeformel {

	public static void main(String[] args) {

		double a = 8;
		double b = 3;
		
		double asq = a*a;
		double bsq = b*b;
		double Ergebnis = asq + (2*a*b) + bsq;
		
		System.out.println("(a+b)^2 = " + Ergebnis);
		
	}	
}
