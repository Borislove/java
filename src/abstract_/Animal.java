package abstract_;

//запрет на создание экземпляра
//использование общего метода
public abstract class Animal {
    public void eat(){
        System.out.println("nyam nyam");
    }

    public abstract void makeSound();
}
