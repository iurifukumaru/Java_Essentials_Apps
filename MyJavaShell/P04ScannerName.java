import java.util.Scanner;

public class P04ScannerName {
    public static void main(String[] args) {
        String prompt = args[0];
        System.out.println(prompt);
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextInt();
        System.out.println("Hello, " + name + ". Nice to meet you.\nYou are " + age + " years old!");

    }
}