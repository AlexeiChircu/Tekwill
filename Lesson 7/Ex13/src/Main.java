import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String Lowercase = input.toLowerCase();
        System.out.println(Lowercase.indexOf("the"));
    }
}