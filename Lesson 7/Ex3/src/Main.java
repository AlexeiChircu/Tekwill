import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
//        System.out.println(line1.replace(" ", "").trim());
//        System.out.println(line2.replace(" ", "").trim());
        System.out.println(line1.replace(" ", "").trim().equals(line2.replace(" ", "").trim()));
    }
}
