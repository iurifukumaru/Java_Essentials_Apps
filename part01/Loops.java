package part01;

import java.util.Scanner;

public class Loops {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose and item from the list below: ");
            System.out.println("______________________________________");
            System.out.println("1. Hot dog");
            System.out.println("2. Hamburguer");
            System.out.println("3. Salade");
            System.out.println("4. Cheesburgher");
            System.out.println("5. Nachos");
            choice = in.nextInt();
        }
        while (choice !=1 && choice !=2 && choice !=3 && choice !=4 && choice !=5);
        switch (choice) {
            case 1: System.out.println("It cost $1.00");
            break;
            case 2: System.out.println("It cost $2.00");
            break;
            case 3: System.out.println("It cost $3.00");
            break;
            case 4: System.out.println("It cost $4.00");
            break;
            case 5: System.out.println("It cost $5.00");
            break;
        }
        double loanBalance = 5000;
        int month = 0;
        while(loanBalance > 0) {
            loanBalance -=500;
            month ++;
        }
        System.out.println("It will take  " + month + " months to pay the loan");

        for(int i=1; i<99; i++) {
            if(i % 2 == 1) {
                System.out.print(i+", ");
            }
        } System.out.print("99\n");
    }
}
