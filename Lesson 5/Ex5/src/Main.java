import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        switch (shape) {
            case "triangle" -> {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(s);
            }
            case "rectangle" ->{
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double s = a*b;
                System.out.println(s);
            }
            case "circle" ->{
                final double pi =3.14;
                double r = sc.nextDouble();
                double s = pi*r*r;
                System.out.println(s);
            }
        }
    }
}