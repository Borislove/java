package graphics;

import javax.swing.*;
import java.awt.*;

public class MyImageHelloWorld extends JPanel {

    private static int x = 3;

    public void paintComponent(Graphics g) {
        Image image1 = new ImageIcon("E:\\java\\src\\hello.jpg").getImage();
        g.drawImage(image1, x, 4, this);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        MyImageHelloWorld panel = new MyImageHelloWorld();
        frame.getContentPane().add(panel);

        for (int i = 0; i <= 300; i++) {
            Thread.sleep(20);
            System.out.println("repaint");
            frame.repaint();
            x++;
            if (i == 300) {
                i = 0;
                x = 3;
            }
        }
    }
}
