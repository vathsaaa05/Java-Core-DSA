import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double conversionRate = 83.0;
        System.out.println("Enter the Amount in INR");
        double inr = sc.nextDouble();
        double usd = inr / conversionRate;
        System.out.printf("Equivalent amount in USD : $%.2f", usd);
    }
}
