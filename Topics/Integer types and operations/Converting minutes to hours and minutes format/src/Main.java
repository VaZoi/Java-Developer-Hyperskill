import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int leftMinute = minutes % 60;
        System.out.println(hours + " hours and " + leftMinute + " minutes");
        scanner.close();
    }
}