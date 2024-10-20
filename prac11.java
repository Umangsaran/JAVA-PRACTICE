import java.util.*;
public class prac11 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        calculator calc=new calculator();
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calc.add(a,b);
        calc.sub(a,b);
        calc.mul(a,b);
        calc.div(a,b);

    }
    static abstract class calc{
        abstract void add(int a,int b);
        abstract void sub(int a,int b);
        void div(int a,int b){
            System.out.println(a/b);
        }
        abstract void mul(int a,int b);
    }
    static class calculator extends calc{
        @Override
        public void add(int a,int b){
            System.out.println(a+b);
        }
        @Override
        public void sub(int a,int b){
            System.out.println(a-b);

        }
        @Override
        public void mul(int a,int b){
            System.out.println(a*b);
        }
    }

    
}
