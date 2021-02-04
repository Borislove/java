import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton implements ActionListener {


    JTextArea text;

    public static void main(String[] args) {
        TestButton gui = new TestButton();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click It");

        /////////////////
        Button_2 button_2 = new Button_2();
        //  frame.add(button_2.button);
        button_2.panel.setBackground(Color.black);
        frame.add((button_2.panel));
        frame.getContentPane().add(BorderLayout.EAST, button_2.button);
        button_2.button.addActionListener(button_2);
        //frame.getContentPane().add(BorderLayout.EAST, button_2.panel);

        //////////
        button.addActionListener(this);
        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);


        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {
        text.append("button clicked \n");
    }

    class Button_2 implements ActionListener {

        JPanel panel = new JPanel();
        JButton button = new JButton("clear");

        public void actionPerformed(ActionEvent ev) {
            //text.selectAll();
            text.append("BUTTON CLEAR!!! \n");
           // text.selectAll();
        }
    }
}


