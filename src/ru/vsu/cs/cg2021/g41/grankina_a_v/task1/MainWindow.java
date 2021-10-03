package ru.vsu.cs.cg2021.g41.grankina_a_v.task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel drawPanel;

    public MainWindow() throws HeadlessException {
        drawPanel = new DrawPanel();
        add(drawPanel);
    }
}
