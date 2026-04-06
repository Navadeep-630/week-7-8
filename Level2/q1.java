import java.util.Scanner;

public class q1 {

    // Method to find factors and return array
    public static int[] getFactors(int n) {
        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Create array
        int[] factors = new int[count];

        // Second loop: store factors
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int s = 0;
        for (int num : arr) {
            s += num;
        }
        return s;
    }

    // Product of factors
    public static int product(int[] arr) {
        int p = 1;
        for (int num : arr) {
            p *= num;
        }
        return p;
    }

    // Sum of squares of factors
    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int num : arr) {
            s += Math.pow(num, 2);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println("Factors are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        sc.close();
    }
}