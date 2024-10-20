public class prac2operations {
    public static void ArithmaticOperation(int a ,int b){  //method to operate Arithmatic operation
        System.out.println("Arithmatic operation :");
        System.out.println("addition :"+(a +b));
        System.out.println("subtraction :"+(a-b));
        System.out.println("multiplication :"+(a*b));
        System.out.println("division :"+(a/b));
        System.out.println("modulus :"+(a%b));
    }
    public static void BitwiseOperation(int a,int b){  //method to operate bitwise operation
        System.out.println("Bitwise operations :");
        System.out.println("and :"+(a  & b));
        System.out.println("Or :"+(a | b));
        System.out.println("Xor :"+(a^b));
        System.out.println("Not :"+(~a));
        
    }
    public static void main(String [] args){ //main function to call the methods
        int a=12;
        int b=5;
        ArithmaticOperation(a,b);
        BitwiseOperation(a,b);
    }
}
