package week02;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount nam = new BankAccount("Nam", 1000);
        BankAccount pat = new BankAccount("Pat", -1000);
        System.out.println("Nam: " + nam);
        System.out.println("Pat: " + pat);
        nam.transfer(pat, 900);
        System.out.println("Nam: " + nam);
        System.out.println("Pat: " + pat);
    }
}
