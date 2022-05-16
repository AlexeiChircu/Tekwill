import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H =sc.nextInt();
        int A =sc.nextInt();
        int B =sc.nextInt();
        int feettoH= H-B;
        int feetsperday= A-B;
        int result = feettoH%feetsperday!=0?feettoH/feetsperday +1:feettoH/feetsperday;
        System.out.println(result);
    }
}