package abstract_;

//https://www.youtube.com/watch?v=kY07wfP2JiA
public class Test {
    public static void main(String[] args) {

    Cat cat = new Cat();
    Dog dog = new Dog();
    cat.makeSound();
    dog.makeSound();

    cat.eat();
    dog.eat();

    //Animal animal = new Animal(); // не даст создать, некоторая концепция
    }
}
