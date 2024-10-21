import java.util.*;
public class prac18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name =sc.nextLine();
        name = name.toLowerCase();
        String rev="";
        for(int i =name.length();i>=0;i--){
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("The name is palindrome");
        }
            else{
                System.out.println("The name is not palindrome");
            
        }
    
}
}
