package com.bridgelabz;

import java.util.Scanner;

public class SumOfNumbers {

    public static void EvenOdd(int sc) {
        int sum=0 ,sum2=0;
        for(int i=0;i<=sc;i++){
            if(i%2==0)
                sum+=i;
            else
                sum2+=i;
        }
        System.out.println("\n Sum of Even number " +sum);
        System.out.println("\n Sum of Odd number " +sum2);
    }

    public static void Prime(int sc){

        for(sc = 1; sc <= 100; sc++)
        {
            int count = 0;
            for (int i = 2; i <= sc/2; i++)
            {
                if(sc % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && sc != 1 )
            {
                System.out.println("\n The Numbers Are ");
                System.out.print(+sc + " ");
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("\n Enter the range : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOdd(n);
        Prime(n);
    }
}
