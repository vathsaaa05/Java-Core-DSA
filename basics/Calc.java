import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input of num1:");
        int num1 = sc.nextInt();
        System.out.println("Give input of num2:");
        int num2 = sc.nextInt();
        System.out.println("Give the Operation which you want to perform (+,-,*,/): ");
        String operator = sc.next();
        int ans = 0;
        if(operator.equals("+")){
            ans = num1 + num2;
        }
        if(operator.equals("-")){
            ans = num1 - num2;
        }
        if(operator.equals("*")){
            ans = num1 * num2;
        }
        if(operator.equals("/")){
            if(num2 != 0){
                ans = num1 / num2;
            }
        }
        System.out.println(ans);
    }
}
