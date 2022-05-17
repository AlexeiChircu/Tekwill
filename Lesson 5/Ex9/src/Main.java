import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            number = sc.nextInt();
            if (number!=0){
                sum++;
            }
        }
        while (number!=0);
        System.out.println(sum);
    }
}

               /* if (in != 0) {
                count++;
                }
                } while (in != 0);

                System.out.println(count);
                }*/