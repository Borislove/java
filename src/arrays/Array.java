package arrays;

import java.util.Arrays;

//плюсы
//скорость доступа по индексу
public class Array {

    static int[] num; //null

    static int[] nums = {1, 2, 3};

    public static void main(String[] args) {
        System.out.println(num); //null

        System.out.println(nums);

        System.out.println(Arrays.toString(nums));


        //целочисленный массив с 9 ячейками
        int[] numbers = new int[10];
        //присваиваем индексу значения
        numbers[0] = 0;
        numbers[1] = 1;
        //другие значение 0
        System.out.println(Arrays.toString(numbers)); //


        String arr[] = {"test", "tes1", "test2"};

        for (String value: arr){
            if(value.contains("test1")){  //содержит ли такое значение
                System.out.println("ok");
            }
        }
    }
}
