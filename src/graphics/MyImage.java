package graphics;

import javax.swing.*;
import java.awt.*;

//загрузка картинки
public class MyImage extends JPanel {


    public void paintComponent(Graphics g){
        Image image = new ImageIcon("E:\\java\\src\\123.jpg").getImage();
        g.drawImage(image,3,4,this);
    }


    public static void main(String[] args) {

        JFrame jFrame = new JFrame();

        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        MyImage image = new MyImage();
        jFrame.getContentPane().add(image);
    }
}
