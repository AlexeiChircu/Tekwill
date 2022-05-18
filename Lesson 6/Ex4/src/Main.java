import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        int maxlength = 1;
        int actlength = 1;
        for (int i=1; i<array.length;i++){
            if (array[i]>array[i-1]){
              actlength++;
              if (maxlength < actlength){
                  maxlength++;
              }
            } else if (array[i] <= array[i-1]) {
                actlength=1;
            }
        }
        System.out.println(maxlength);
    }
}