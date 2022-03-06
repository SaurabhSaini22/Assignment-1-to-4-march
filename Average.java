package Statements_Operators;

import java.util.Scanner;
class Average{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 numbers");
        for(int i = 0; i<10;i++){
            sum = sum+s.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
}
