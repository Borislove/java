package getset;

public class Test {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        if (i > 10) {
            this.i = i;
        }else
            System.out.println("значение маленькое");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setI(9);

        System.out.println(t.getI()); //0
    }
}
