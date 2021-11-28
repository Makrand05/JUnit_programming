import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number");
        int decimal=sc.nextInt();
        int tmp=decimal;
        String binary="";
        while(decimal>0){
            int remender=decimal%2;
            binary+=remender;
            decimal/=2;
        }
        StringBuffer sb=new StringBuffer(binary);
        sb.reverse();
        System.out.println("Binary number of the number "+tmp+" is : "+sb);
    }
}
