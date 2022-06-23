import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double result = power(a, n);
        System.out.println(result);
    }
    public static double power(double a, long n){
        if ( n == 0){
            return 1;
        }
        if ( n % 2 == 0){
            return power(a * a, n / 2);
        } else {
            return a * power(a, n-1);
        }
    }

}