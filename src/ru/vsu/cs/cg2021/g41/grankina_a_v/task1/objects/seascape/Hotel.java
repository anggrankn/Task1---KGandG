package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;

import java.awt.*;

public class Hotel extends DrawingObject {

    public Hotel(double constX, double constY, double constWidth, double constHeight) {
        super(constX, constY, constWidth, constHeight);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0xE57F35));
        g.fillRect((int) (constX * panelWidth), (int) (constY * panelHeight), (int) (constWidth * panelWidth),
                (int) (constHeight * panelHeight));

        g.setColor(new Color(0x80411B));
        g.fillArc((int) (constX * panelWidth), (int) (((constY - 0.5 * constHeight) * panelHeight)), (int) (constWidth * panelWidth),
                (int) (constHeight * panelHeight), 0, 180);

        g.setColor(new Color(0x149BF5));
        for (int i = 0; i < 4; i++) {
            g.fillRect((int) ((constX + (i > 1 ? 0.5 : 0.2) * constWidth) * panelWidth), (int) ((constY + (i % 2 == 0 ? 0.2 : 0.5) * constHeight) * panelHeight),
                    (int) ((0.25 * constWidth) * panelWidth), (int) ((0.25 * constHeight) * panelHeight));
        }

        /*g.fillRect((int)((constX + 0.2 * constWidth) * panelWidth), (int)((constY + 0.2 * constHeight) * panelHeight),
                (int)((0.25 * constWidth) * panelWidth), (int)((0.25 * constHeight) * panelHeight));
        g.fillRect((int)((constX + 0.2 * constWidth) * panelWidth), (int)((constY + 0.5 * constHeight) * panelHeight),
                (int)((0.25 * constWidth) * panelWidth), (int)((0.25 * constHeight) * panelHeight));
        g.fillRect((int)((constX + 0.5 * constWidth) * panelWidth), (int)((constY + 0.2 * constHeight) * panelHeight),
                (int)((0.25 * constWidth) * panelWidth), (int)((0.25 * constHeight) * panelHeight));
        g.fillRect((int)((constX + 0.5 * constWidth) * panelWidth), (int)((constY + 0.5 * constHeight) * panelHeight),
                (int)((0.25 * constWidth) * panelWidth), (int)((0.25 * constHeight) * panelHeight));
         */

        Font font = new Font("Arial", Font.BOLD, (int) (200 * constWidth));
        g.setFont(font);
        g.setColor(new Color(0xE2DB9F));
        g.drawString("Hotel", (int) ((constX + 0.3 * constWidth) * panelWidth), (int) ((constY - 0.125 * constHeight) * panelHeight));

        g.setColor(oldColor);
    }
}
