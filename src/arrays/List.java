package arrays;

import java.util.ArrayList;

public class List {

    static ArrayList<String> str = new ArrayList<String>();

    //add(Object elem) // добавляет в список параметр Object
    //remove(int index) //удаляет объект по переданногому индексу
    //remove(Object elem) //удаляет указанный объект(если он находится внутри ArrayList)
    //contains(Object elem) // Возвращает true, если нашлось совпадение дл переданного объекта
    //isEmpty() //возвращает true, если список не содержит элементов
    //indexOf(Object elem) //Возвращает либо индекс объекта, переданного в параметре , либо -1
    //size() //Возвращает количество элементов в списке на текущий момент.
    //get(int index) Возвращает объект, который сейчас находится по индексу, переданному в параметре

    public static void main(String[] args) {
        str.add("hello");
        System.out.println(str.isEmpty());

        System.out.println(str.get(0));
    }
}


