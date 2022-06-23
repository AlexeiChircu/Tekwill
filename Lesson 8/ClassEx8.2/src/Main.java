import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int number = sc.nextInt();
        print(word);
        print(word, number);
    }
    public static void print(String word, int number) {
        System.out.println("print(" + word + ", " + number + ")");
    }
    public static void print(String word) {
        System.out.println("print(" + word + ")");
    }
}