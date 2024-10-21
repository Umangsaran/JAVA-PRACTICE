import java.util.*;
public class prac19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringTokenizer s1 =new StringTokenizer("26 27 28");
        int sum =0;
        while(s1.hasMoreTokens()){
            int number=Integer.parseInt(s1.nextToken());
            System.out.println(number+"");
            sum += number;
        }
        System.out.println("\n sum of number is :"+sum);
    }
}

