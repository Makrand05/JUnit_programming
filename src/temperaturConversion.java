import java.util.Scanner;

public class temperaturConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n 1 - Celsius to Fahrenheit\n 2 - Fahrenheit to Celsius ");
        System.out.println("enter your Choice");
        int choice = sc.nextInt();
        double C, F;
        switch (choice) {
            case 1:
                System.out.print("Enter Temp in Celsius");
                C = sc.nextDouble();
                F = (C * 9 / 5) + 32;
                System.out.println("The Temp in Fahrenheit : " + F);
                break;
            case 2:
                System.out.print("Enter Temp in Fahrenheit");
                F = sc.nextDouble();

                final double i = 5 / 9;

                C = (F - 32) * i;
                System.out.println("The Temp in Celsius : " + C);
            default:
                System.out.println("Please enter Curret choice");
        }
    }
}
