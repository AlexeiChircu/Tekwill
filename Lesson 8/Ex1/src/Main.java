import java.util.Scanner;
public class Main {
    public static int extractInt(double d) {
        int number = (int)d;
        return number;
//write your code here
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}