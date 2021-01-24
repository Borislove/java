package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//при нажатии улыбается
public class MyImage_3 extends JPanel implements ActionListener {

static     Image image1 = new ImageIcon("E:\\java\\src\\123.jpg").getImage();
    static Image image2 = new ImageIcon("E:\\java\\src\\234.jpg").getImage();

    JButton button;

    static boolean b = true;

    public void paintComponent(Graphics g) {
        if (b) {
            g.drawImage(image1, 3, 4, this);
        } else
            g.drawImage(image2, 3, 4, this);
    }

    JFrame jFrame1;
    static JFrame jFrame2;

    public void go() {
        //2 окно с кнопкой
    //    JFrame jFrame1 = new JFrame();
        jFrame1 = new JFrame();
        jFrame1.setSize(200, 200);
        jFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setVisible(true);
        jFrame1.setLocationRelativeTo(null);
        JButton button = new JButton("CLICK ME PLEASE");
        jFrame1.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println(b);
        b = false;
        System.out.println(b);
       jFrame2.repaint();

        //JOptionPane.showInputDialog("test test test");
    }

    public static void main(String[] args) {
        ///1 окно
        jFrame2 = new JFrame();
      //  JFrame jFrame = new JFrame();
        jFrame2.setSize(300, 300);
        jFrame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame2.setLocationRelativeTo(null);
        jFrame2.setVisible(true);

        MyImage_3 image = new MyImage_3();
        jFrame2.getContentPane().add(image);

        ////////////////////////
        System.out.println(b);

        MyImage_3 image_2 = new MyImage_3();
        image_2.go();

        System.out.println(b);

    }


}

