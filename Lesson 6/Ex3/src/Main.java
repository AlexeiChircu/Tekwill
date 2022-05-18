import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        int elemets = sc.nextInt();
        int [] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<size; i++){
            if (array[i]>n){
                sum+=array[i];
            }
        }
        System.out.println(sum);
    }
}

//        for (var el: array){
//                if (el>n){
//                sum+=el;
;