
//super class run by itself but no output
class Animal{
    public void sound(){
        System.out.println("Hop, Hop");
    }
}

//subclass
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    
    }
}

//subclass
class Cat extends Animal {
    @Override // concept the sub class are same
    public void sound(){
        System.out.println("Meow");
    }
}

//sub class
class Cow extends Animal {
    @Override // override super class
    public void sound(){
        System.out.println("Mooo");
    }
}

public class Polymophism { //cameout in oracle exam

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();
    }
    
}
