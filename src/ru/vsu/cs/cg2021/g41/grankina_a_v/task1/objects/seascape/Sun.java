package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;
import java.awt.*;

public class Sun extends DrawingObject {
    private final int n = 15;
    private final double l = 0.041;

    public Sun(double constX, double constY, double constWidth, Color color) {
        super(constX, constY, constWidth, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0xF3C742));
        g.fillOval((int)((constX - constWidth* 0.5) *panelWidth), (int) ((constY - constWidth* 0.5) * panelWidth),
                (int)( constWidth * panelWidth), (int)(constWidth * panelWidth));

        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = constX + constWidth* 0.5 * Math.cos(a);
            double y1 = constY + constWidth* 0.5 * Math.sin(a);
            double x2 = constX + (constWidth* 0.5 + l) * Math.cos(a);
            double y2 = constY + (constWidth* 0.5 + l) * Math.sin(a);
            g.drawLine((int) (x1 * panelWidth), (int) (y1 * panelHeight), (int) (x2 * panelWidth), (int) (y2 * panelHeight));
        }

        g.setColor(oldColor);
    }
}
