package Statements_Operators;

import java.util.*;
public class Fraction{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerator");
        int num = input.nextInt();
        System.out.println("Enter denominator");
        int den = input.nextInt();

        //calculating HCF
        int a,b,gcd,t;
        if(num>den){
            a = num;
            b = den;
        }
        else{
            b = num;
            a = den;
        }
        while (b != 0){
            t = b;
            b = a % b;
            a = t;
        }
        gcd = a;

        System.out.println("In lowest form = "+num/gcd+"/"+den/gcd);
    }
}
