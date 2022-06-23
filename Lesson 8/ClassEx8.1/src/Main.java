import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int result = sumInRange(from, to);
        System.out.println(result);
    }
    public static int sumInRange(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }
}