import java.util.Scanner;
//2.	A program which show’s your variable stores even/odd number.

public class TaskTwo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("The number is negative");
        }
        sc.close();

    }

}
