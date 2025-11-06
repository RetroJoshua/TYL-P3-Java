import java.util.Scanner;
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if(xorEqual(first, second)) {
            System.out.println(first + " and " + second + " are equal.");
        } else {
            System.out.println(first + " and " + second + " are not equal.");
        }

        scanner.close();
    }

    private static boolean xorEqual(int first, int second) {
        // Use bitwise XOR: if two integers are equal their XOR is 0
        return (first ^ second) == 0;
    }
}
