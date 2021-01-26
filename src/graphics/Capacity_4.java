package graphics;

import javax.swing.*;
import java.awt.*;

public class Capacity_4 {

    private static int speed =600;

    private static int x = 0;
    private static int y = -1;
    //координаты полоски
    private static int xStrip = 177;
    private static int yStrip = 295;
    //размеры полоски
    private static int xStripWidth = 86;
    private static int xStripHeigh = 10;


    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean h = false;
    private boolean j = false;
    private boolean k = false;

    private boolean test = true;

    public static void main(String[] args) {
        Capacity_4 cp = new Capacity_4();
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

        for (int i = 0; i <= 8; i++) {
            // yStrip -= 10;
            try {
                Thread.sleep(speed);
            } catch (Exception ex) {

            }
            if (x <= 9) {
                x++;
                /*if (x == 9) {
                    x = 0;
                }*/
            }
            mp.repaint();
        }
        JOptionPane.showInputDialog("СПАСИБО ЗА ПРОСМОТР");
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
            //g.fillRect(xStrip, yStrip, xStripWidth, xStripHeigh);

            /*g.setColor(Color.white);
            g.fillRect(175, 295, 90, 10);*/
            if (a) {
                g.fillRect(xStrip, 295, xStripWidth, xStripHeigh);
            }

            if (b) {
                g.fillRect(xStrip, 280, xStripWidth, xStripHeigh);
            }

            if (c) {
                g.fillRect(xStrip, 265, xStripWidth, xStripHeigh);
            }
            if (d) {
                g.fillRect(xStrip, 250, xStripWidth, xStripHeigh);
            }
            if (e) {
                g.fillRect(xStrip, 235, xStripWidth, xStripHeigh);
            }

            if (f) {
                g.fillRect(xStrip, 220, xStripWidth, xStripHeigh);
            }
            if (h) {
                g.fillRect(xStrip, 205, xStripWidth, xStripHeigh);
            }
            if (j) {
                g.fillRect(xStrip, 190, xStripWidth, xStripHeigh);
            }
            if (k) {
                g.fillRect(xStrip, 175, xStripWidth, xStripHeigh);
            }


            if (a && b && c && d && f && h && j && k) {
                g.setColor(Color.red);
                int y = 177;
                for (int i = 0; i <= 8; i++) {
                    g.fillRect(xStrip, y, xStripWidth, xStripHeigh);
                    y += 15;

                    /*if(i==8){
                        g.setColor(Color.blue);
                        g.fillRect(xStrip, 295, xStripWidth, xStripHeigh);
                    }*/
                }
            }

            if (test) {

                if (a && b && c && d) {
                    int y = 295;
                    for (int i = 0; i <= 3; i++) {
                        g.setColor(Color.green);
                        g.fillRect(xStrip, y, xStripWidth, xStripHeigh);
                        y -= 15;
                    }
                    test = false;
                }
            }


            switch (x) {
                case 0:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 295, xStripWidth, xStripHeigh);
                    a = true;
                    break;
                case 1:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 280, xStripWidth, xStripHeigh);
                    b = true;
                    break;

                case 2:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 265, xStripWidth, xStripHeigh);
                    c = true;
                    break;

                case 3:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 250, xStripWidth, xStripHeigh);
                    d = true;
                    break;


                case 4:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 235, xStripWidth, xStripHeigh);
                    e = true;
                    break;

                case 5:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 220, xStripWidth, xStripHeigh);
                    f = true;
                    break;

                case 6:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 205, xStripWidth, xStripHeigh);
                    h = true;
                    break;

                case 7:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 190, xStripWidth, xStripHeigh);
                    j = true;
                    break;

                case 8:
                    g.setColor(Color.orange);
                    g.fillRect(xStrip, 175, xStripWidth, xStripHeigh);
                    k = true;
                    break;
            }
        }
    }
}



