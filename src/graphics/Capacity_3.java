package graphics;

import javax.swing.*;
import java.awt.*;

//рисовании полоски вверх
public class Capacity_3 {
    //координаты полоски
    private static int xStrip = 176;
    private static int yStrip = 295;
    //размеры полоски
    private static int xStripWidth = 88;
    private static int xStriHeigh = 9;

    public static void main(String[] args) {
        Capacity_3 cp = new Capacity_3();
        cp.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyPanel mp = new MyPanel();

        frame.getContentPane().add(mp);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        for (int i = 0; i < 12; i++) {
            yStrip -= 10;
            try {
                Thread.sleep(300);
            } catch (Exception ex) {

            }
            mp.repaint();
        }
    }


    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
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
        }
    }
}
