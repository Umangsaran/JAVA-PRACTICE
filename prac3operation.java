public class prac3operation {
    public static void main(String[] args){
        operations op =new operations();
        int a = op.add(5,7);
        System.out.println(a);
        int b = op.subtract(7,5);
        System.out.println(b);
        int c= op.mul(5,7);
        System.out.println(c);
        int d =op.div(12,4);
        System.out.println(d);
        int e =op.mod(12,5);
        System.out.println(e);
        int f =op.and(12,13);
        System.out.println(f);
        int g =op.or(12,4);
        System.out.println(g);




        
    }
    public static class operations {  //method to performm various operations
        int add(int a,int b){
            int c=(a+b);
            return c;
        }
        int subtract(int a,int b){
            int c= a-b;
            return c;
        }
        int mul(int a, int b){
            int c=a*b;
            return c;

        }
        int div(int a ,int b){
            int c=a/b;
            return c;
        }
        int mod(int a,int b){
            int c=a%b;
            return c;
        }
        int and(int a,int b){
            int c=a&b;
            return c;
        }
        int or(int a ,int b){
            int c=a|b;
            return c;
        }
    }
}
