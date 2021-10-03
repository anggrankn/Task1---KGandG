package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects;

import java.awt.*;

public class Background extends DrawingObject {
    public Background(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0xC28898));
        g.fillRect(0, 0, width, height / 2);

        g.setColor(new Color(0xD5B744));
        g.fillRect(0, height / 2, width, height / 2);

        g.setColor(oldColor);
    }
}
