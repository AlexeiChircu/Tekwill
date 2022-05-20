import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String range = sc.nextLine();`
        String [] words = range.split(" ");
        String result= words[0];

        for(int i=0; i< words.length;i++) {
            String word = words[i];
            if (result.length() < word.length()){
                result=word;
            }
        }
        System.out.println(result);

    }
}
//one two three four five six