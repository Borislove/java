import javax.swing.*;
import java.awt.*;

public class MyButton2 extends JFrame {

    JButton button;

    MyButton2() {

        //  ImageIcon icon = new ImageIcon("E:\\javadoc\\test.png");
        // ImageIcon icon = new ImageIcon("E:\\javadoc\\Кнопка.png");
        ImageIcon icon = new ImageIcon("E:\\javadoc\\Безымянный-1.png");

        //button = new JButton("click");
        button = new JButton();
        button.setBounds(10, 10, 163, 55);
        button.addActionListener(e -> System.out.println("ПРИВЕТ САНЯ "));
        button.setFocusable(true);
        button.setIcon(icon);
        // button.setHorizontalTextPosition(JButton.CENTER);
        //button.setBorder(BorderFactory.createEtchedBorder());  //бордюрчик
        //  button.setEnabled(false);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.add(button);
    }

    public static void main(String[] args) {
        new MyButton2();
    }
}
