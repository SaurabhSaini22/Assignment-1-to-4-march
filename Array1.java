package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements");
        int[] arr = new int[10];
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length/2;i++){
            arr1[i] += arr[i];
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i =arr.length/2 ;i<arr.length;i++){
            arr2[i - arr.length/2] += arr[i];
            System.out.print(arr2[i - arr.length/2]+" ");
        }

    }
}
