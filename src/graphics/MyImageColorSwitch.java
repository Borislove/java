package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//при нажатии кнопки меняется цвет
public class MyImageColorSwitch extends JPanel implements ActionListener {

    private static JFrame frame;

    private static JButton jButton;
    private static JPanel jPanel;

    private static boolean b = true;

    public void paintComponent(Graphics g) {
        //default black
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.green);
        g2d.fillRect(20, 20, 20, 20);

        //g2d.rotate(32);  //   // TODO: 25.01.2021 кнопка появилась..еще и повернута
        if (b) {
            g2d.setColor(Color.green);
            b = false;
        } else {
            g2d.setColor(Color.white);
            b = true;
        }

        g2d.drawLine(300, 100, 100, 100);
    }

    public static void main(String[] args) {
         frame = new JFrame();
        MyImageColorSwitch mtr = new MyImageColorSwitch();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.getContentPane().add(mtr);

        jButton = new JButton("click");
        mtr.add(jButton);
        jButton.addActionListener(mtr);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //    JOptionPane.showInputDialog("test");
        // jButton.setText("test");
     //   System.out.println(b);

        frame.repaint();
       // System.out.println(b);
    }
}
