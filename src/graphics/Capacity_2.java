package graphics;

import javax.swing.*;
import java.awt.*;

public class Capacity_2 extends JPanel {

    //координаты полоски
    private static int xStrip = 176;
    private static int yStrip = 295;
    //размеры полоски
    private static int xStripWidth = 88;
    private static int xStriHeigh = 9;

    private static JFrame frame;

    public void paintComponent(Graphics g) {
        //шапочка
        g.setColor(Color.black);
        g.fillRect(195, 155, 45, 45);
        //рамка
        g.setColor(Color.green);
        g.fillRect(170, 170, 100, 140);
        //внутренности
        g.setColor(Color.black);
        g.fillRect(175, 175, 90, 130);
        /*g.setColor(Color.orange);
        g.fillRect(xStrip, yStrip, xStripWidth, xStriHeigh);*/

    }

    public static void main(String[] args) throws InterruptedException {

        frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Capacity_2 cp = new Capacity_2();
        frame.getContentPane().add(cp);


        frame.setVisible(true);
    }
}




