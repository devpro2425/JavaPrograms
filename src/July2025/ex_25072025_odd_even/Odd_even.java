package July2025.ex_25072025_odd_even;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number, i will tell you odd or even");
        int num= sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Num is even ");

        }
        else
        {
            System.out.println("Num is odd");

        }

    }
}
