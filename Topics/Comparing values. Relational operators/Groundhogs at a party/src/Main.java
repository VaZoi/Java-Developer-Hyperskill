import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        // You can use scanner.nextBoolean() to read a boolean value
        boolean isWeekend = scanner.nextBoolean();
        if ((!isWeekend && num1 >= 10 && num1 <= 20) || (isWeekend && num1 >= 15 && num1 <= 25)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}