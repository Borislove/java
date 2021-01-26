package graphics.figures;

import javax.swing.*;

public class Window {

    private int x = 500;
    private int y = 500;

    JFrame frame = new JFrame();
    JButton jButton = new JButton("knopka");
    JPanel jPanel = new JPanel();

    JPanel jPanel2 = new JPanel();

    //общие настройки
    public Window() {
        frame.setSize(getX(), getY());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //  setResizable(false);

        //frame.add(jPanel.add(jButton));

        frame.getContentPane().add(new Square()); //всю площадь занимает?

                /*jPanel2.add(new Square());
        frame.add(jPanel2);*/

        /*jPanel.add(jButton);
        frame.add(jPanel);*/

        frame.setVisible(true);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
