package graphics;

import javax.swing.*;
import java.awt.*;

public class Capacity extends JPanel {

    private static int x = 0;

    //координаты полоски
    private int xStrip = 176;
    private int yStrip = 295;
    //размеры полоски
    private int xStripWidth = 88;
    private int xStriHeigh = 9;

   // private int distanceStrip = 10;

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


        //полоска
        g.setColor(Color.orange);
        g.fillRect(xStrip, yStrip, xStripWidth, xStriHeigh);

       /* g.setColor(Color.orange);
        g.fillRect(175,280, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,265, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,250, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,235, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,220, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,205, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,190, 90,10);

        g.setColor(Color.orange);
        g.fillRect(175,175, 90,10);*/

        //yStrip = yStrip + 15;
        //   g.fillRect(xStrip, yStrip - distanceStrip, xStripWidth, xStriHeigh);

        int test = 10;
        for (int i = 0; i < 12; i++) {
            //g.fillRect(xStrip, yStrip - distanceStrip, xStripWidth, xStriHeigh);
            g.fillRect(xStrip, yStrip - test, xStripWidth, xStriHeigh);
            System.out.println("i " + i);
            System.out.println(xStrip + " " + yStrip + " " + xStripWidth + " " + xStriHeigh);
            test += 10;
        }
    }

public void sleep() throws InterruptedException {
        Thread.sleep(300);
}

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();

        Capacity cp = new Capacity();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.getContentPane().add(cp);
        frame.setVisible(true);

    }
}

