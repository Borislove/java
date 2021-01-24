package graphics;

import javax.swing.*;
import java.awt.*;

public class MyImageHelloWorld_2 extends JPanel {

    private static int x = 3;
    private static int y = 3;

    private static boolean b = true;

    public void paintComponent(Graphics g) {

        Image image1 = new ImageIcon("E:\\java\\src\\hello.jpg").getImage();
        g.drawImage(image1, x, 4, this);


        g.drawImage(image1, 10, x + 10, this);
        g.drawImage(image1, 10 + x, x + 10, this);

        Image image2 = new ImageIcon("E:\\java\\src\\hello1.jpg").getImage();
        g.drawImage(image2, y, 20, this);

        //   Image image3 = new ImageIcon("E:\\java\\src\\hello.jpg").getImage();
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        MyImageHelloWorld_2 panel = new MyImageHelloWorld_2();
        frame.getContentPane().add(panel);

        for (int i = 0, z = 0; i <= 300; i++, z++) {
            Thread.sleep(5);
            //System.out.println("repaint");
            frame.repaint();
            x++;


            if (b) {
                y++;
            } else y--;
            if (y == 290) {
                b = false;
            }
            if(y == -110){
                b = true;
            }

            if (i == 300) {
                i = 0;
                x = 3;
            }

            System.out.println(y);
        }
    }
}

