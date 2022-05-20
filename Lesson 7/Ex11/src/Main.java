import java.util.Scanner;

public class Main {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder palindrome = new StringBuilder(input);
        if (input.equals(palindrome.reverse().toString())) {
            System.out.println("yes");
        }   else {
            System.out.println("no");
        }
    }
}
