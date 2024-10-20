public class prac22{
    public static void main(String... args){
        try{
            ageCal(-10);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static void ageCal(int x) throws NegativeAgeException{
        if(x<0){
            throw new NegativeAgeException();
        }
    }
}
class NegativeAgeException extends Exception{
    public NegativeAgeException(String message){
        super(message);
    }
    public NegativeAgeException(){
        super("Age cannot be negative");
    }
}