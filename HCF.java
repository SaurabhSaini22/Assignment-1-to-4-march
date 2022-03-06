package Statements_Operators;

import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int GCD =1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
               GCD = i;
        }
        System.out.println("HCF of two numbers "+GCD);
    }
}
