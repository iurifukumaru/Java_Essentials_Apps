package part02;

import java.util.Scanner;

public class P01LogicalOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();

        if(age < 2) {
            System.out.println("Infant");
        }
        else if(age < 12) {
            System.out.println("Child");
        }
        else if(age < 65) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Old");
        }

    }
}
