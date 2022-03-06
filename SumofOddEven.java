package Statements_Operators;

import java.util.Scanner;

public class SumofOddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evensum = 0, oddsum = 0, temp;

        while(num!=0)
        {
            temp = num%10;
            num = num/10;
            if(temp%2==0){
                evensum += temp;
            }
            else {
                oddsum += temp;
            }
        }
        System.out.println("Sum of even digits: "+evensum +", "+ "Sum of odd digits: "+ oddsum);
    }
}
