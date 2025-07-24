package July2025.ex_18072025;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int Name= scanner.nextInt();
        System.out.println("Enter the Name\n");
        System.out.println("Your name is "+Name);
        scanner.close();
        int age= scanner.nextInt();
        System.out.println("Enter the age\n");
        System.out.println("Your age is "+age);

        int Salary= scanner.nextInt();
        System.out.println("Enter the Salary\n");
        System.out.println("Your salary "+Salary);
        //System.out.println(age>25?"Allowed to vote": "Not allowed to vote");
        scanner.close();
}}
