import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int sum = sumInRange(from, to);
        System.out.println(sum);
//        System.out.println(sumInRange(from, to)); se poate de afisat deodata metoda
    }
    public static int sumInRange(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }
}