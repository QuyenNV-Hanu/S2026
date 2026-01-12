package week01;

import java.util.Scanner;

public class EggCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of eggs you wish to counter: ");
        int eggAmount = sc.nextInt();
        int gross = eggAmount / 144;
        eggAmount %= 144;
        int dozen = eggAmount / 12;
        eggAmount %= 12;
        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + eggAmount);
    }
}
