package part01;

import java.util.Scanner;

public class LogicalOperations {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = in.nextInt();
        if(age < 2) System.out.println("You are a baby!");
        else if(age < 10) System.out.println("You are a infant!");
        else if(age < 65) System.out.println("You are a adult!");
        else System.out.println("You are a senior!");


    }
}
