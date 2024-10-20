import java.util.*;
public class prac4 {
    public static void main(String[] args){
        employee e1 = new employee();
        e1.setdetails();
        e1.getdetails();
    }
    
}
class employee{       

    private String name;
    public String role;
    private String shift;
    private int age;
    private int salary;
    public void setdetails (){
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter your name :");
    name = sc.nextLine();
    System.out.println("enter the role ");
    role = sc.nextLine();
    System.out.println("enter the shift :");
    shift = sc.nextLine();
    System.out.println("enter your age :");
    age = sc.nextInt();
    System.out.println("enter the salary :");
    salary =sc.nextInt();

    }
    public void getdetails(){
        System.out.println("name : "+name);
        System.out.println("role :"+role);
        System.out.println("shift :"+shift);
        System.out.println("age :"+age);
        System.out.println("salary"+salary);

    }
}
