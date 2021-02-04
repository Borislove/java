package loop;

public class While_2 {
    public static void main(String[] args) {

        String str = "";
        //выполнять пока значение пустое
        while (str.isBlank()){
            System.out.println("hmmm");
            str +="exit";
        }
    }
}
