import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int leap = scanner.nextInt();
        if ((leap % 4 == 0) && (leap % 100 != 0) || (leap % 400 == 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}