package math;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
         System.out.println("Enter number n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while (n>0) {
            int a=n%10;
            System.out.print(a);
            n=n/10;
        }
    }
}
