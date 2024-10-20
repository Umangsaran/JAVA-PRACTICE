import java.util.*;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + fibo(n));
        System.out.println("The " + n + "th Fibonacci number (recursive) is: " + fibo2(n));
    }

    public static int fibo(int n) {                                             //defining fibo method

        if (n <= 1) {                                                           //condition 
            return n;
        }
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {                                          //non recursive approach
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int fibo2(int n) {
        if (n <= 1) {
            return n;
        }
return fibo2(n - 1) + fibo2(n - 2);                                            //recursive approach
    }
}