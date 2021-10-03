package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.util;

import java.awt.*;

public class DrawUtil {
    public static void drawWithColor(Graphics2D gr2d, Color color, Runnable drawAction) {
        Color oldC = gr2d.getColor();
        gr2d.setColor(color);
        drawAction.run();
        gr2d.setColor(oldC);
    }

    public static void drawWithFont(Graphics2D gr2d, Font font, Runnable drawAction) {
        Font oldF = gr2d.getFont();
        gr2d.setFont(font);
        drawAction.run();
        gr2d.setFont(oldF);
    }
}
