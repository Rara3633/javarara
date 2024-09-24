
class Animal {

    String name;
    
    public Animal (String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + "makes an intersting sound");
    }
}

//sub class

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound(){
        super.sound(); // take from up
        System.out.println(name + "Barks");
    }
}

public class This {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Ayaa");
        System.out.println();
    }
}


