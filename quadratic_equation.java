public class QuadraticEquation{
	public static void main(String[] args){
		if (args.length != 3) {
			System.out.println("Podales niepoprwana ilosc argumentow");
			return;
		}
		double a,b,c;
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
		double delta = getDelta(a,b,c);
		computeAndPrintResult(delta,a,b);
	}
	public static double getDelta (double a, double b, double c){
		return b*b - 4*a*c;
	}
	public static void computeAndPrintResult (double delta, double a, double b) {
		if (delta < 0) {
			System.out.println("Delta mniejsza niz 0");
			return;
		}
		if (delta == 0){
			System.out.println("Delta rowna 0 wiec mamy jedno rozwiazanie x = " + -b/(2*a));
			return;
		}
		double sqrt_delta = Math.sqrt(delta);
		System.out.println("Rownanie ma dwa rozwiazania x1 = " + (-b-sqrt_delta)/(2*a) + " lub x2 = " + (-b+sqrt_delta)/(2*a));
	}
}
