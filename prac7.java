import java.util.*;
public class prac7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of prime numbeer to be print");
        int n=sc.nextInt();
        prime(n);


    }
    public static void prime(int n){
        for(int i=2;i<n;i++){
            int a=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    a=1;
                    break;
                }
            }
            if (a!=1){
                System.out.println(i+" ");
            }
        }

    }
    
}
