package Statements_Operators;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum=0, temp;
        while(num != 0) {
            temp = num % 10;
            num = num / 10;
            sum+=temp;
        }
        System.out.println("Sum of Numbers "+ sum);
    }
}
