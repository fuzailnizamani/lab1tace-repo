import java.util.Scanner;

//4.    4.	Create a program in which user is asked for marks in a respected way (Matriculation , Intermediate and Test result) where output would be the CPN.
public class TaskFour {
    public static void main(String[] args) {
        float matric, inter, test, cpn;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your matric percentage:");
        matric = sc.nextFloat();
        matric = matric * 0.1f;
        System.out.println("Enter your intermediate percentage:");
        inter = sc.nextFloat();
        inter = inter * 0.2f;
        System.out.println("Enter your test marks:");
        test = sc.nextInt();

        test = test * 0.7f;

        sc.close();

        cpn = matric + inter + test;
        System.out.println("Your CPN is:" + cpn);

    }
}