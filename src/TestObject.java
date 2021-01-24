import java.util.ArrayList;

public class TestObject {

    public static void main(String[] args) {

        ArrayList<Object> objList = new ArrayList<Object>();

        Object object = new Object();
        Object object1 = new Object();

        objList.add(object);
        objList.add(object);

        System.out.println(objList);
        System.out.println(objList.size());

        System.out.println(objList.get(0).hashCode());
        System.out.println(objList.get(1).hashCode());

        objList.add(object1);
        System.out.println(objList.get(2).hashCode());  //другой объект

        System.out.println(object.equals(object1));
    }
}
