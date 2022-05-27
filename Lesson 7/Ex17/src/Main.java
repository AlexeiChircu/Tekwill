import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        if (input.length() % 2 == 0 ) {
            sb.delete( (input.length() / 2) - 1, input.length() / 2 + 1 );
        } else {
            sb.deleteCharAt((input.length() / 2) + 1);
        }
        System.out.println(sb);
    }
}