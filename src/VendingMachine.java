import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();
        calculateCashCount(amount);
        }

    private static void calculateCashCount(int amount) {
        int cash[]={1000,500,100,50,10,5,2,1};
        int counter=0;
        while(amount>0) {
            for (int i = 0; i < 8; i++) {
                if (amount >= cash[i]) {
                    int temp = amount / cash[i];
                    //notes+=temp;
                    System.out.println("Note of "+cash[i]+" : "+temp);
                    amount %= cash[i];
                    counter++;
                }
            }
        }

        System.out.println("Total count of notes : "+counter);
    }
}
