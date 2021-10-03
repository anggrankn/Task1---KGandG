package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects;

import java.awt.*;

public abstract class DrawingObject {
    protected final double constX;
    protected final double constY;
    protected final double constWidth;
    protected final double constHeight;
    protected final Color color;

    public DrawingObject(double constX, double constY, double constWidth, double constHeight, Color color) {
        this.constX = constX;
        this.constY = constY;
        this.constWidth = constWidth;
        this.constHeight = constHeight;
        this.color = color;
    }

    public DrawingObject(double constX, double constY, double constWidth, double constHeight) {
        this.constX = constX;
        this.constY = constY;
        this.constWidth = constWidth;
        this.constHeight = constHeight;
        this.color = null;
    }

    public DrawingObject(double constX, double constY, double constWidth, Color color) {
        this.constX = constX;
        this.constY = constY;
        this.constWidth = constWidth;
        this.constHeight = 0;
        this.color = color;
    }


    public abstract void draw(Graphics2D g, int width, int height);
}

