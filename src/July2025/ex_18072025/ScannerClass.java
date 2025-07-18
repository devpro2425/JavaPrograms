package July2025.ex_18072025;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //scanner -class
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age= scanner.nextInt();
        System.out.println(age>25?"Allowed to vote":"Not allowed to vote");
    }
}
