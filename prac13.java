public class prac13 {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.sound();
    }

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Lion extends Animal {
        @Override
        void sound() {
            super.sound();
            System.out.println("Lion make a sound roars");
        }
    }
}