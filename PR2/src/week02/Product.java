package week02;

import java.util.Scanner;

public class Product {
    private String name; // compulsory, mutable
    private double price = 0; // compulsory, mutable, default = 0
    private double discount = 0; // optional, mutable, default = 0
    private Scanner sc = new Scanner(System.in);

    public Product() {}

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private double getImportTax() {
        return this.price * 0.1;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Discount: " + this.discount);
        System.out.println("Tax: " + this.getImportTax());
    }

    public void input(){
        System.out.print("Enter product name: ");
        this.name = sc.nextLine();
        System.out.print("Enter product price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter product discount: ");
        this.discount = sc.nextDouble();
    }
}
