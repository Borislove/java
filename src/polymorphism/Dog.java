package polymorphism;

public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("Dog eating");
    }

    public void bark(){
        System.out.println("Dog is barking...");
    }
}
