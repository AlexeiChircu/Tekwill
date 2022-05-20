import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String rangeinteg = a + " " + b;
        System.out.println(str.substring(0,rangeinteg.length()));
    }
}
// substring(a,b+1);