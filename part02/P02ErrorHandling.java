package part02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P02ErrorHandling {
    public static void main (String[] args) throws FileNotFoundException {
        String inputFileName;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the file name: ");
        inputFileName = in.nextLine();
        Scanner inFile = null;
        double total = 0;
        int count = 0;
        try {
            inFile = new Scanner(new File(inputFileName));
            while (inFile.hasNextDouble()) {
                total = inFile.nextDouble();
                count ++;
            }
            System.out.printf("The average is: %8.2f", (total/count));
            System.out.println();
        } catch (FileNotFoundException file) {
            System.out.println("The input file was not found. Try again.");
        }
        finally {
            try {
                inFile.close();
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception has occurred.");
            }
        }
    }
}
