package Statements_Operators;

import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int fact  = 1;
        if(n==0){
            System.out.println("Factorial is "+n);
        }
        if(n>=1) {
            for (int i = n; i >= 1; i--) {

                fact = fact * i;
            }
            System.out.println("Factorial is "+fact);
        }
    }
}
