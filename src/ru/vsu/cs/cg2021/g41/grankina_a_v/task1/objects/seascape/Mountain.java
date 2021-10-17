package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.DrawingObject;
import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.util.ArrayUtil;
import java.awt.*;

public class Mountain extends DrawingObject {
    private final double[] x;
    private final double[] y;

    public Mountain(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);

        this.x = new double[]{constX, constX + constWidth * 0.5, constX + constWidth};
        this.y = new double[]{constY, constY - constHeight, constY};
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(color);
        g.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth)),
                ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight)), 3);

        g.setColor(oldColor);
    }
}
