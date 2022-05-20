import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int nrofPizzas = sc.nextInt();
        double price = sc.nextDouble();
        double pricediscount = price*0.8;
        String receipt =
                String.format("Restaurant Java\n" +
                        "Thank you %s for visiting our restaurant.\n" +
                        "You’ve ordered %d pizzas.\n" +
                        "With the total price of: %.2f\n" +
                        "Price with 20%% discount: %.2f",
                        name,nrofPizzas, price,pricediscount );

        System.out.println(receipt);
    }
}