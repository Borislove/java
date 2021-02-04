package loop;

//выполнять пока истино выражение
public class While {

    public static void main(String[] args) {

        int i = 0; //инициализация счетчика
        while (i <10){
            System.out.println(i);
            i++;
        }
        System.out.println("while пройден");
    }
}
