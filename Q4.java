
import java.util.Scanner;

public class Q4 {
//     4. Find the largest of two numbers.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a and b :::");
    int a = sc.nextInt();
    int b = sc.nextInt();
//String result=a>b?"a is larger":"b is larger";
//    System.out.println(result);
    if(0>=a ||b<=0)
        System.out.println("enter valid number");
    else if (a>b)
        System.out.println("a is largest");
    else if(b>a)
        System.out.println("b is largest");

}
}
