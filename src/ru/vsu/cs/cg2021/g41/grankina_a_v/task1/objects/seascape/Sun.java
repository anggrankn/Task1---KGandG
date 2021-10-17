package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;
import java.awt.*;

public class Sun extends DrawingObject {
    private final int n = 15;
    private final double l = 0.1;

    public Sun(double constX, double constY, double constWidth, Color color) {
        super(constX, constY, constWidth, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0xF3C742));
        g.fillOval((int) ((constX * panelWidth) - (constWidth * panelWidth)),
                (int) ((constY * panelHeight) - (constWidth * panelWidth)),
                (int) (2 * constWidth * panelWidth), (int) (2 * constWidth * panelWidth));

        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = constX + constWidth * Math.cos(a);
            double y1 = constY + constWidth * Math.sin(a);
            double x2 = constX + (constWidth + l) * Math.cos(a);
            double y2 = constY + (constWidth + l) * Math.sin(a);
            g.drawLine((int) (x1 * panelWidth), (int) (y1 * panelHeight), (int) (x2 * panelWidth), (int) (y2 * panelHeight));
        }

        g.setColor(oldColor);
    }
}
