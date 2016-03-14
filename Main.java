//Project_2_Palindrome.

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //Scanner numberForPalindrome = new Scanner(System.in);
        //int number = numberForPalindrome.nextInt();
        int number = 1; //Our number
        int palindrome = number;

        // A small number of logic computation palindrome.
        for (int i = 0; i < number; i++) {
            if (!isPalindrome(palindrome)) {
                palindrome++;
            }
            else {
                break;
            }
        }
        System.out.println("Initial positive number is '" + number + "'");
        System.out.println("Nearest palindrome for this number is '" + palindrome + "'");
        System.out.println();
        System.out.println("The program was carried out " + (System.currentTimeMillis() - startTime) + " milliseconds.");
    }

    // The method determines whether a given number of palindrome.
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int palindrome = number;
        while (palindrome != 0) {
            reverse = reverse * 10 + palindrome % 10;
            palindrome /= 10;
        }
        if (number == reverse) {
            return true;
        }
        else {
            return false;
        }
    }

}