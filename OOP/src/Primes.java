public class Primes {
    public static void main(String[] args) {
        final int last = 1000000;
        int max = -1;
        for (int i = 0; i < last; i++) {
            boolean isPrime = true;
// even numbers over 2 are not prime
            if (i > 2 && (i & 1) == 0) isPrime = false;
// primes have a remainder when divided by a lower odd number
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
// System.out.println(i);
                max = i;
            }
        }
        System.out.println("Highest prime is " + max);
    }
}
