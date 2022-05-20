import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' | input.charAt(i) == 'C' | input.charAt(i) == 'g' | input.charAt(i) == 'G'){
                count++;
            }
        }
        double result = count / input.length() * 100;
        System.out.println(result);
    }
}