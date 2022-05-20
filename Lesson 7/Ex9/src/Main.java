public class Main {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        char letter = 'A';
        char lastletter = 'Z';
        while (letter <= lastletter) {
            builder.append(letter + " ");
            letter++;
        }
        builder.delete(builder.length()-1,builder.length());// delete the last space
        System.out.println(builder);
    }
}
