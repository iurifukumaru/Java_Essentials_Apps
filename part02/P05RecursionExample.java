package part02;

public class P05RecursionExample {
    public static void main(String[] args) {
        System.out.println("The countdown has begun!");
        countDown(10);
        System.out.println("blastoff");
    }
    public static void countDown(int count) {
        if(count == 0) return;
        System.out.println(count + "...");
        countDown(count - 1);
    }
}
