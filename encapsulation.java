public class encapsulation { //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void age(int age){
        this.age = age;
    }

    public void main(String name){
        this.name = name;
    }

    public int setAge(){
        return age;
    }

    public static void main(String[] args){ //output
        encapsulation person = new encapsulation();
        person.setAge();
        person.setName("Eya");

        System.out.println(person.getName() + " is " + person.getAge() + " years old ");
    }
}