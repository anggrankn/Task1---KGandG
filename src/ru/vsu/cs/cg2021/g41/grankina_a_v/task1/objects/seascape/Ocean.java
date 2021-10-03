package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;
import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.util.ArrayUtil;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Ocean extends DrawingObject {
    private final double[] x;
    private final double[] y;

    public Ocean(double constX, double constY, double constWidth, double constHeight) {
        super(constX, constY, constWidth, constHeight);

        this.x = new double[] {constX, constX + constWidth, constX};
        this.y = new double[] {constY, constY, constY + constHeight};
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x3E3ED0));
        g.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth)),
                ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight)), 3);

        GeneralPath s = new GeneralPath();
        s.moveTo(constX + constWidth, constY);
        s.curveTo((constX + constWidth) * panelWidth, constY * panelHeight, (constX + constWidth) * panelWidth,
                (constY + 0.5 * constHeight) * panelHeight, constX * panelWidth, (constY + constHeight) * panelHeight);
        g.fill(s);

        g.setColor(oldColor);
    }
}
