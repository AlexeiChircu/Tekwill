import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean result = (a>0 && b<=0 && c<=0)|| (a<=0 && b>0 && c<=0)||(a<=0 && b<=0 && c>0);
        System.out.println(result);
    }
}