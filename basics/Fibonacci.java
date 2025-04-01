/* To calculate Fibonacci Series up to n numbers. */

package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //Taking the nth number until the Fibonacci series should iterate.
        int first = 0; //As the Fibonacci Series starts with 0.
        int second = 1;
        int count = 2;
        //Loop will iterate until the count is greater than or equals to the input.
        while (count <= num) {
            int temp = second;
            second += first;
            first = temp;
            count++;
        }
        System.out.println(second);
    }
}
