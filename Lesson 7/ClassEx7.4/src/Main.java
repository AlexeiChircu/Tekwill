import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String [] word = name.split(" ");
        for (int i = 0; i< word.length; i++){
            System.out.print(word[i].substring(0, 1));
        }
    }
}