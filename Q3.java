

import java.util.Scanner;

public class Q3 {
//    Check if a number is divisible by 5 and 11
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%5==0)
        System.out.println("divisible by 5");
    else if(n%11==0)
        System.out.println("divisible by 11");
    else
    System.out.println("number not divisible by both 5 and 11");
}
}
