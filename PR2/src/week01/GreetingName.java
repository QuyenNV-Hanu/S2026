package week01;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        name = name.toUpperCase();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
