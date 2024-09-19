public class encapsulation { 

    private String[] name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String[] name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void main(String[] name){
        this.name = name;
    }

    public int getAge;(){
        return age;
    }

    public static void main(String[] args){ //output
        Encapsulation person = new Encapsulation();
        person.setName (name: "Eya");
        person.setAge (age: 27);

        System.out.printIn(person.getName() + "is" + person.getAge() + "years old");
    }
}