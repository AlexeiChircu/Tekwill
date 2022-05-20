import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for ( int i=0 ; i < input.length() ; i++) {
            if(Character.isLetter(input.charAt(i))) {
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
    }
}
