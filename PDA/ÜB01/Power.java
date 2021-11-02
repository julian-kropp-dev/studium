public class Power {
	public static void main (String[] args) {
		int a = 2;
		int b = 4;
		int result = a;
		for (int i = 0; i < b-1; i++) {
			result = result * a;
		}
		System.out.println (result);
	}
}
