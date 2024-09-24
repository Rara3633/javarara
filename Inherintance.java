
//Super Class

class Animal {
    public void eat (){
        System.out.println("the animals is eating");

        class Dog extends Animal {
                public void bark(){
                    System.out.println();
                }
        }
    }
}


public class Inherintance {
    
    public static void main(String[] args) {
        Dog dog = new Dog ();
        dog.eat();
        dog.bark();
    }
    }


}
