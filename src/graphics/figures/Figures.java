package graphics.figures;

import javax.swing.*;
import java.awt.*;

abstract class Figures {
    static {
        System.out.println("Класс загружен " + Figures.class);
    }

    private String name;

    abstract void paintComponent(Graphics g);
}
