

public class prac15 {
    public static void main(String [] args){
        Balance.Account a1=new Balance.Account("xyz",123,5000);
        Balance.Account a2=new Balance.Account("abc",124,5100);
        System.out.println(a1.getname());
        System.out.println(a1.getid());
        System.out.println(a1.getamount());
        System.out.println(a2.getname());
        System.out.println(a2.getid());
        System.out.println(a2.getamount());
    }
    static class Balance{
        static class Account{
            String name;
            int id;
            int amount;
            public Account(String name,int id,int amount){
                this.name=name;
                this.id=id;
                this.amount=amount;
            }
            public String getname(){
                return name;
            }
            public int getid(){
                return id;
            }
            public int getamount(){
                return amount;
            }
        }
    }
    
}
