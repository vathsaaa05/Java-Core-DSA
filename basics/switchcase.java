import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango" :
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("Red fruit");
                break;
            case "Banana" :
                System.out.println("it's a banana");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}