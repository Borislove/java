package cycle;

public class DoWhile {

      static   int i = 0;
    public static void main(String[] args) {

        //выполнять в любом случаее
        do {
            System.out.println("Test");
            System.out.println(i);
            i++;
        } while (i < 10) ;{
            System.out.println("Test 2");
            i++;
        }
    }
}
