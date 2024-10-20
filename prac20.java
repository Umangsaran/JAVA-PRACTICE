public class prac20{
    public static void main(String... args){
        int a = 5, b = 0, c = 0;
        try{
            c = a / b;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e);
        }
        catch(Exception f){
            System.out.println("Exception has occured");
        }
    }
}