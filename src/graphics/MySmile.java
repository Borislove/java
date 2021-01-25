package graphics;

import javax.swing.*;
import java.awt.*;

public class MySmile extends JPanel {

    private static int x = 0;

    public void paintComponent(Graphics g) {

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);

        Color randEye = new Color(green, blue, red);

        Color randLips = new Color(blue, red, green);

        //задний фон
        g.setColor(randomColor);
        g.fillRect(x, 0, this.getWidth(), this.getHeight());

       /* //2 слой
        g.setColor(randEye);
        g.fillRect(x, 0, this.getWidth(), this.getHeight());

        //3 слой
        g.setColor(randLips);
        g.fillRect(x, 0, this.getWidth(), this.getHeight());*/


        //кружок
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);

        //глаз левый
        g.setColor(randEye);
        g.fillOval(90, 105, 15, 15);


        //глаз правый
        g.setColor(randEye);
        g.fillOval(130, 105, 15, 15);


        g.setColor(randLips);
        g.fillOval(105, 135, 25, 25);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();
        MySmile mc = new MySmile();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.getContentPane().add(mc);
        frame.setVisible(true);

        for (int i = 0; i <= 500; i++) {
            Thread.sleep(1);
            mc.repaint();
            x++;
            if (i == 500) {
                i = 0;
                x = 3;
            }
        }
    }
}




