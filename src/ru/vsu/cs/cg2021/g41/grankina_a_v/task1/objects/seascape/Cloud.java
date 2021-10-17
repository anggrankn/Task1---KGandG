package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;

import java.awt.*;

public class Cloud extends DrawingObject {
    public Cloud(double constX, double constY, double constWidth, double constHeight) {
        super(constX, constY, constWidth, constHeight);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        int width = 55;
        int height = 55;

        Color oldColor = g.getColor();

        g.setColor(new Color(0xF3EFEF));
        double a = 0;
        double b = 0;
        double c = 0.0125;
        for (int i = 0; i <= 4; i++) {
            if (i <= 2) {
                g.fillOval((int) ((constX + a) * panelWidth), (int) ((constY - b) * panelHeight), width, height);
                b += 0.0125;
            } else {
                g.fillOval((int) ((constX + a) * panelWidth), (int) ((constY - c) * panelHeight), width, height);
                c -= 0.0125;
            }
            a += 0.025;
            if (i <= 3) {
                g.fillOval((int) ((constX + a) * panelWidth), (int) ((constY) * panelHeight), width, height);
            }
        }

        g.setColor(oldColor);
    }
}
