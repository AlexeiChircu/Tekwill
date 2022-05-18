import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] [] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                int temp = j-i;
                int a = temp <0 ? -temp : temp;
                arr [i][j] = a;
            }
        }
        for(int[] ints : arr){
            for(int temp : ints){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }
}