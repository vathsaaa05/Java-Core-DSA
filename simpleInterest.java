import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle Value:");
        double principle = sc.nextDouble();
        System.out.print("Enter the Time Value (Year):");
        double time = sc.nextDouble();
        System.out.print("Enter the Rate Value:");
        double rate = sc.nextDouble();
        double SI = (principle * time * rate) / 100;
        System.out.println(SI);

    }
}
