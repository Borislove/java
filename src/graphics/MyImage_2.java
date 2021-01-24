package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TODO: 24.01.2021 прикольно , кучу новых фреймов
public class MyImage_2 extends JPanel implements ActionListener {

    static Image image1 = new ImageIcon("E:\\java\\src\\123.jpg").getImage();
    static Image image2 = new ImageIcon("E:\\java\\src\\234.jpg").getImage();

    JButton button;

   static boolean b = true;

    public void paintComponent(Graphics g) {
        if (b) {
            g.drawImage(image1, 3, 4, this);
        } else
            g.drawImage(image2, 3, 4, this);
    }

    public void go() {
        //2 окно с кнопкой
        JFrame jFrame1 = new JFrame();
        jFrame1.setSize(200, 200);
        jFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setVisible(true);
        jFrame1.setLocationRelativeTo(null);
        JButton button = new JButton("CLICK ME PLEASE");
        jFrame1.add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        ///1 окно
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        MyImage_2 image = new MyImage_2();
        jFrame.getContentPane().add(image);

        ////////////////////////
        MyImage_2 image_2 = new MyImage_2();
        image_2.go();
    }

    public void actionPerformed(ActionEvent event) {
        b =false;
        //JOptionPane.showInputDialog("test test test");
        MyImage_2 image_2 = new MyImage_2();
        image_2.go();
    }
}

