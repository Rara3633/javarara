
interface Animals{
    void sound();

    interface Playbale{
        void play();
    }

    class Dog implements Animal, Playbale {
        @Override
        public void sound(){
            System.out.println("Nok Nok");
        }
    }

    @Override
    public void play()[
        System.out.println("Dog nak balik home");
    ]
}

public class Interfaced {
    
    public static void main(String[] args) {
        System.out.println("Dog aumm");
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
