class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }
    void eats(){
        System.out.println("Eats Anything");
    }
    void sleep(){
        System.out.println("Usually sleeps at night");
    }
}
class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    void eats(){
        System.out.println("eats pedigree");
    }
    void sleep(){
        System.out.println("Sleeps any time");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Animal dog = new Dog("Tom");
        dog.eats();
        dog.sleep();
    }
}
