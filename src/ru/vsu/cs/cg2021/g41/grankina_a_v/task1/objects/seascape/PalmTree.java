package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;
import java.awt.*;

public class PalmTree extends DrawingObject {

    public PalmTree(double constX, double constY, double constWidth, double constHeight) {
        super(constX, constY, constWidth, constHeight);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x6F3C21));
        g.fillRect((int)((constX + 0.25 * constWidth) * panelWidth),(int)((constY + constHeight) * panelHeight),
                (int)((0.25 * constWidth) * panelWidth ),(int)((constHeight * 4) * panelHeight));

        g.setColor(new Color(0x28AA28));
        g.fillArc((int)((constX - 0.5 * constWidth) * panelWidth), (int)(constY * panelHeight),
                (int)(constWidth * panelWidth), (int)(constHeight * panelHeight), 0, 180);
        g.fillArc((int)(constX * panelWidth), (int)((constY - 0.5 * constHeight) * panelHeight),
                (int)(constWidth * panelWidth), (int)(constHeight * panelHeight), - 90, 180);
        g.fillArc((int)((constX + 0.5 * constWidth) * panelWidth), (int)(constY * panelHeight),
                (int)(constWidth * panelWidth), (int)(constHeight * panelHeight),  - 180, 180 );
        g.fillArc((int)(constX * panelWidth), (int)((constY + 0.5 * constHeight) * panelHeight),
                (int)(constWidth * panelWidth), (int)(constHeight * panelHeight), 90, 180);

        g.setColor(oldColor);
    }
}
