import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long p = 1L;
        for (int i = a; i < b; i++) {
            p *= i;
        }
        System.out.println(p);
    }
}