import javax.swing.*;

public class TestTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField field = new JTextField("Введите ваше имя");
        JPanel panel = new JPanel();
        panel.add(field);
        frame.add(panel);

        field.selectAll(); //выбрать весь текст

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
