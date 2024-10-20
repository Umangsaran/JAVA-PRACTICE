public class prac21{
    public static void main(String... args){
        int a = 5, b = 0, c = 0;
        try{
            String st = null;
            System.out.println(st.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }
        try{
            c = a/b;
        }
        catch(Exception f){
                System.out.println("Division By Zero Not Allowed"); 
        }
        finally{
            System.out.println("This is the final block");
        }
    }
}