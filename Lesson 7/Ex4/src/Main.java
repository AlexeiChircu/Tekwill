import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String [] parts = data.split("-");
        String year = parts[0];
        String month = parts[1];
        String day = parts[2];
        System.out.println(month + "/" + day + "/" + year);
    }
}
