package cycle;

public class For {


    public static void main(String[] args) {

        boolean b = true;
   /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
*/

        //тест условия
        /////////////////////////////////
        for (int i = 0; b; i++) {
            //   System.out.println(i);
            if (i == 20) {
                b = false;
                System.out.println(i);
            }
        }

        //стандартный цикл
        ///////////////////////////
        for (int i = 0; i < 10; i++) {
            System.out.println(i);  //выводим инкремент
        }
        System.out.println("конец for");


        //бесконечный TODO: 13.01.2021 мешает следующему циклу
     /*   for (; ; ) {
            System.out.println("hello for"); //
        }*/

        int[] i = {1, 2, 3, 4};
        //для перебора значений из массива
        for (int value : i) {
            System.out.println(value);
        }
    }
}


//  инициализация: условие: итерация