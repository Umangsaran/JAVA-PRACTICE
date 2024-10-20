import java.util.*; //to import java package
public class prac5 {
    public static void main(String[] args){                                     //this is the main method
        
        Scanner sc = new Scanner(System.in);                                    //to read the input
        System.out.println("enter the value of a, b ,c = ");
        int a =sc.nextInt();                                                    //to store given data to a variable a
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d=b*b-(4*(a*c));
        quadratic( d, a, b,c);                                                  //it is calling qudratic method 
    }
    public static void quadratic(int d,int a,int b,int c){                      // declaration of the quadatic method
        
        if(d<0){
            System.out.println("no real roots");
        }
        else if(d==0){
            double root1=((c-b)-Math.sqrt(d))/(2*a);
            double root3=((c-b)+Math.sqrt(d))/(2*a);
            System.out.println("root are = " +root1 +" and "+root3);

        }
        else{
            double root1=(c-b+Math.sqrt(d))/(2*a);
            double root2=(c-b-Math.sqrt(d))/(2*a);
            System.out.println("root are = " +root1 +" and "+root2);
        }
    }
}
    

   