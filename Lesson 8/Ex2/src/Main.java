import java.util.Scanner;
public class Main {
    public static boolean isVowel(char ch) {
        char [] arr = {'A','a','E','e','I','i','O','o','U','u'};
        for (char a: arr){
            if (a == ch){
                return true;
            }
        }
        return false;
//write your code here
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}