import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String sequence = sc.nextLine();
        int count = 0;
        int lastposition = 0;
        while ((lastposition = sentence.indexOf(sequence, lastposition)) != -1){
            count++;
            lastposition+=sequence.length();
        }
        System.out.println(count);
    }
}
