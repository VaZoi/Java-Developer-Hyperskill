import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input and calculate square
        int input = Integer.parseInt(scanner.nextLine());
        int square = input * input;
        // Print the result
        System.out.println(square);
    }
}