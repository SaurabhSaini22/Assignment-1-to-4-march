package Statements_Operators;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();

        for(int i=n;i>0;i--)
        {
            for(int k=n;k>i;k--) {
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++) {
                if(j%2==0) {
                    System.out.print("1"+" ");
                }
                else
                    System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
}
