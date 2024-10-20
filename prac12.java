public class prac12 {
    public static void main(String [] args){
        Teenagegirl girl=new Teenagegirl();

        System.out.println("now it's girl !!");
        girl.voice();
        girl.memory();
        System.out.println("now it's boy !!");
        Teenageboy boy=new Teenageboy();
        boy.voice();
        boy.memory();
    }
    interface Man{
        void voice();
    }
    interface Women{
        void memory();
    }
    static class Teenagegirl implements Man,Women{
        @Override
        public void voice(){
            System.out.println("soft voice");
        }
        @Override
        public void memory(){
            System.out.println("high memory");
        }

    }
    static class Teenageboy implements Man,Women{
        @Override
        public void voice(){
            System.out.println("hard voice");
        }
        @Override
        public void memory(){
            System.out.println("low memory");
        }
    }
}
