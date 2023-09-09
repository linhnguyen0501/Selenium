package javatest1;

public class ucln {
	public static int gcdByBruteForce(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
		return gcd;

}
	public static void main(String[] args) {
		int ucln = gcdByBruteForce (4,6);
		System.out.println(ucln);
	}
}
