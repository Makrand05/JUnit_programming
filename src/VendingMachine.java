import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();
        int cash1000 = 0;
        int cash500 = 0;
        int cash100 = 0;
        int cash50 = 0;
        int cash10 = 0;
        int cash5 = 0;
        int cash2 = 0;
        int cash1 = 0;
        if (amount >= 1000) {
            cash1000 = amount / 1000;
            amount %= 1000;
        }
        if (amount >= 500) {
            cash500 = amount / 500;
            amount %= 500;
        }
        if (amount >= 100) {
            cash100 = amount / 100;
            amount %= 100;
        }
        if (amount >= 50) {
            cash50 = amount / 50;
            amount %= 50;
        }
        if (amount >= 10) {
            cash10 = amount / 10;
            amount %= 10;
        }
        if (amount >= 5) {
            cash5 = amount / 5;
            amount %= 5;
        }
        if (amount >= 2) {
            cash2 = amount / 2;
            amount %= 2;
        }
        if (amount >= 1) {
            cash1 = amount;
        }
        System.out.println("Notes of 1000 : "+cash1000);
        System.out.println("Notes of 500 : "+cash500);
        System.out.println("Notes of 100 : "+cash100);
        System.out.println("Notes of 50 : "+cash50);
        System.out.println("Notes of 10 : "+cash10);
        System.out.println("Notes of 5 : "+cash5);
        System.out.println("Notes of 2 : "+cash2);
        System.out.println("Notes of 1 : "+cash1);

        System.out.println("Total number of Notes : "+(cash1+cash2+cash5+cash10+cash100+cash50+cash500+cash1000));
    }
}
