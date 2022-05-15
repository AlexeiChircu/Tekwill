import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int firstd = number/100;
        int secondd = (number/10)%10;
        int thirdd = number%10;
        int sum = firstd+secondd+thirdd;

        System.out.println(sum);
    }
}