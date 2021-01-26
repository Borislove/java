package graphics.figures;

import javax.swing.*;
import java.awt.*;

final class Square extends JPanel {
    static {
        System.out.println("Класс загружен " + Square.class);
    }

    //@Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(250, 250, 50, 50);
    }
}
