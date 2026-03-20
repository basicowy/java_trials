public class TextConversion {
	public static void main (String[] args){
		if (args.length != 3){
			System.out.println("Niepoprawna liczba argumentów(wymagane są 3");
			return; 
		}

		int a,b;
		a = Integer.parseInt(args[1]);
		b = Integer.parseInt(args[2]);
		if (a < 0 || b < 0) {
			System.out.println("Argument ujemny jest niedozwolony");
			return;
		}
		if (b == 0) {
			System.out.println("Nie ma nic do wyswietlenia");
			return;
		}
		System.out.println(getSubString(args[0],a,b));
	}
	public static String getSubString (String text, int a, int b){
		int changedLength = b;
		int len = text.length();
		if (b > len) changedLength = len-1;
		return text.substring(a,changedLength+1);
	}
}
