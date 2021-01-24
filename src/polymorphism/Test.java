package polymorphism;

//https://www.youtube.com/watch?v=c8eGIPF-o3Q
public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal();
       // Dog dog = new Dog();

        //animal.eat();
        //dog.eat();

        Animal animal = new Dog(); // вызов методов только в родителе
        animal.eat();
        //animal.bark();
        Dog dog = new Dog(); //конкретные методы класса
        dog.eat();
        dog.bark();


        Animal animal1 = new Animal();
        Dog dog1  = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog1);
        test(cat);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
