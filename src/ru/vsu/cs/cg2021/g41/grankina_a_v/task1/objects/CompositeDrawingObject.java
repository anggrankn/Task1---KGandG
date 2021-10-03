package ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects;

import java.awt.*;
import java.util.ArrayList;

public class CompositeDrawingObject extends DrawingObject {
    private final ArrayList<DrawingObject> drawingObjects = new ArrayList<DrawingObject>();

    public CompositeDrawingObject(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    public void addDrawingObject(DrawingObject drawingObjects) {
        this.drawingObjects.add(drawingObjects);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        for (DrawingObject drawingObject : drawingObjects) {
            drawingObject.draw(g, width, height);
        }
    }
}
