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
        g.fillOval((int)(constX * panelWidth), (int)(constY * panelHeight), width, height);
        g.fillOval((int)((constX + 0.025) * panelWidth), (int)((constY - 0.0125) * panelHeight),width, height);
        g.fillOval((int)((constX + 0.05) * panelWidth), (int)((constY - 0.025) * panelHeight), width, height);
        g.fillOval((int)((constX + 0.075) * panelWidth), (int)((constY - 0.0125) * panelHeight), width, height);
        g.fillOval((int)((constX + 0.1) * panelWidth), (int)((constY) * panelHeight), width, height);
        g.fillOval((int)((constX + 0.075) * panelWidth), (int)((constY + 0.0125) * panelHeight), width, height);
        g.fillOval((int)((constX + 0.05) * panelWidth), (int)((constY + 0.0125) * panelHeight),width, height);
        g.fillOval((int)((constX + 0.025) * panelWidth), (int)((constY + 0.0125) * panelHeight),width, height);

        g.setColor(oldColor);
    }
}
