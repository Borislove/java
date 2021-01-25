package graphics;

import javax.swing.*;
import java.awt.*;

//кружок в рандомном цвете
public class MyCirlce extends JPanel {

    private static int x = 0;

    public void paintComponent(Graphics g) {

        g.fillRect(x, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();

        MyCirlce mc = new MyCirlce();

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(mc);
        frame.setVisible(true);

        for (int i = 0; i <= 300; i++) {
            Thread.sleep(20);
            mc.repaint();
            x++;
            if (i == 300) {
                i = 0;
                x = 3;
            }
        }
    }
}


