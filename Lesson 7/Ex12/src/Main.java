import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 1;
        char letter = input.charAt(0);
        letter++;
        for (int i = 1; i < input.length(); i++) {
            if ((input.charAt(i) > input.charAt(i-1)) && (input.charAt(i) <= letter)) {
                letter++;
                count++;
            }
        }
        if (count == (input.length())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
