import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder builder = new StringBuilder(s);
        if (n <= s.length()) {
            builder.delete(0, n);
            builder.append(s.substring(0, n));
            System.out.println(builder);
        } else {
            System.out.println(s);
        }
    }
}