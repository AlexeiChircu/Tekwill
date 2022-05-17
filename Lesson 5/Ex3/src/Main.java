import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if (K <= N * M && (K % N == 0 && K >= N || K % M == 0 && K >= M)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
