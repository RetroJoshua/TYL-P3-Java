import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int num) {
        // Store the original number
        int originalNumber = num;
        int reversedNumber = 0;
        
        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        
        // Check if the original number equals its reverse
        return originalNumber == reversedNumber;
    }
}
