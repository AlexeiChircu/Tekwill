import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 0 -> System.out.println("do not move");
            case 1 -> System.out.println("move up");
            case 2 -> System.out.println("move down");
            case 3 -> System.out.println("move left");
            case 4 -> System.out.println("move right");
            default -> System.out.println("error!");
        }
    }
}