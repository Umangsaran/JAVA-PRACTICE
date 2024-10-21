public class prac14 {
    public static void main(String [] args){
        Calculator c1=new Calculator();
        c1.add(5,9);
        c1.sub(30,9);
        c1.mul(5,6);
        c1.div(18,3);
    }
    interface cal3{
        void add(int a,int b);
        void sub(int a,int b);
    }
    interface cal4 extends cal3{
        void mul(int a,int b);
        void div(int a,int b);
    }
    static class Calculator implements cal4{
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
        @Override
        public void div(int a,int b){
            System.out.println(a/b);
        }
    }
    
}
