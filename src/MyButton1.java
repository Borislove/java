import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton1 extends JFrame implements ActionListener{

        JButton button;

        MyButton1() {

            button = new JButton("click");
            button.setBounds(100, 100, 100, 50);
            button.addActionListener(this);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500, 500);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

            this.add(button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println("hello");
            }
        }


    public static void main(String[] args) {
        new MyButton1();
    }
}
