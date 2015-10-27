
public class Binomischeformel {

	public static void main(String[] args) {

		double a = 8;
		double b = 3;
		
		double asq = a*a;
		double bsq = b*b;
		double Ergebnis1 = asq + (2*a*b) + bsq;
		double Ergebnis2 = (a+b)*(a+b);
		
		System.out.println("a^2 + 2ab + b^2 = " + Ergebnis1);
		System.out.println("(a+b)^2 = " + Ergebnis2);
		
		if (Ergebnis1 == Ergebnis2)
			{
			System.out.println("(a+b)^2 = a^2 + 2ab + b^2");
			} 
		
	}	
}
