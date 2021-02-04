import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JFrame implements ActionListener {

    JButton button;
    JButton button1;

    MyButton() {

        button = new JButton("click");
        button1 = new JButton("click_2");

        button.setBounds(10, 10, 100, 50);
        button1.setBounds(10, 70, 100, 50);

        button.addActionListener(this);
        button1.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.add(button);
        this.add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("hello");
        }

        if(e.getSource() == button1){
            System.out.println("Good-bye");
        }
    }

    public static void main(String[] args) {
        new MyButton();
    }
}
