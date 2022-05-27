import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = String.valueOf(input.charAt(0));
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) == input.charAt(i)) {
                count++;
            } else {
                output += count + String.valueOf(input.charAt(i));
                count = 1;
            }
            }
        output += count;
        System.out.println(output);
    }
}
