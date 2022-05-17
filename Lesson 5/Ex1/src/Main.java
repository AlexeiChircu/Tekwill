import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        if (H<A) {
            System.out.println("Deficiency");
        } else if (H>B) {
            System.out.println("Excess");
        } else if (H>=A && H<=B){ System.out.println("Normal");
        }
    }
}