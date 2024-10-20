public class prac10 {
    public static void main(String[] args){
        overloadingexample obj1 =  new overloadingexample();
        overloadingexample obj2 = new overloadingexample("umang");
        int ans1=obj1.sum(2,8,4);
        int ans2=obj2.sum(10,20);
        System.out.println("ans1 ="+ans1);
        System.out.println("ans2 ="+ans2);

    }
    static  class overloadingexample{
        String name;

        overloadingexample() {
            System.out.println("no-arg constructor");
        }
        overloadingexample(String name){
            this.name=name;
            System.out.println(name);
        }
        int sum(int y,int x){
            return x+y;
        }
        int sum(int x,int y,int z){
            return x+y+z;
        }

    }
}
