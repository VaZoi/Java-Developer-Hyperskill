import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateEvenSum(numbers);
        System.out.println(sum);
    }

    public static int calculateEvenSum(int[] arr) {
        // TODO: Add a multi-line comment explaining the method's purpose
        /**
         * The main method accepts an array of string arguments,
         * And calculates the sum of the array.
         */
        int sum = 0;

        // TODO: Implement the logic to calculate the sum of even numbers
        // Add single-line comments to explain each step

        for (int num : arr) {
            // Check if the number is even
            if (num % 2 == 0) {
                // If the number is even, add it to the sum
                sum += num;
            }
        }
        return sum;
    }
}