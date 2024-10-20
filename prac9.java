import java.util.*;
public class prac9 {
    public static void main(String [] args){
        ArrayList<String> name=new ArrayList<>();
        name.add("john");
        name.add("alice");
        name.add("peeter");
        name.add("parker");
        name.add("sam");
        System.out.println("before sorting"+name);
        Collections.sort(name);
        System.out.println("After Sorting :"+name);
    }
}
