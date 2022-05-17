import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String house = sc.nextLine();
        String Explanation = switch (house) {
            case "gryffindor" -> "bravery";
            case "hufflepuff" -> "loyalty";
            case "slytherin" -> "cunning";
            case "ravenclaw" -> "intellect";
            default -> "not a valid house";
        };
        System.out.println(Explanation);
    }
}
