package ru.vsu.cs.cg2021.g41.grankina_a_v.task1;

import javax.swing.*;
import java.awt.*;

import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.*;
import ru.vsu.cs.cg2021.g41.grankina_a_v.task1.objects.seascape.*;

public class DrawPanel extends JPanel {
    private final World world;

    public DrawPanel() {
        world = new World(0, 0, 1, 1, new Color(0xFFFFFF));
        world.addDrawingObject(new Background(0, 0, 1, 1, new Color(1)));

        world.addDrawingObject(new Cloud(0.04166, 0.0625, 0.05,0.0625));
        world.addDrawingObject(new Cloud(0.2083, 0.125, 0.05,0.0625));
        world.addDrawingObject(new Cloud(0.6666, 0.125, 0.05,0.0625));
        world.addDrawingObject(new Cloud(0.833, 0.0625, 0.05,0.0625));
        world.addDrawingObject(new Sun(0.5, 0.175, 0.033, new Color(0xE9E9F5)));

        world.addDrawingObject(new Mountain(0.166,0.5,0.333,0.3125,new Color(0x5C86C4)));
        world.addDrawingObject(new Mountain(0.5,0.5,0.333,0.3125,new Color(0x5C86C4)));

        world.addDrawingObject(new Mountain(0,0.5,0.333,0.3125,new Color(0x90C2C2)));
        world.addDrawingObject(new Mountain(0.333,0.5,0.333,0.3125,new Color(0x90C2C2)));
        world.addDrawingObject(new Mountain(0.666,0.5,0.333,0.3125,new Color(0x90C2C2)));

        world.addDrawingObject(new Hotel(0.75, 0.5, 0.166, 0.25));
        world.addDrawingObject(new PalmTree(0.666, 0.625, 0.066, 0.05));
        world.addDrawingObject(new PalmTree(0.5, 0.625, 0.066, 0.05));
        world.addDrawingObject(new PalmTree(0.583, 0.5, 0.066, 0.05));

        world.addDrawingObject(new Ocean(0,0.5,0.333, 0.5));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics = (Graphics2D) g;
        this.world.draw(graphics, this.getWidth(), getHeight());

        /*Sun.drawSun(graphics, 600, 140, 40, 90, 15);

        Clouds.drawClouds(graphics, 50, 50);
        Clouds.drawClouds(graphics, 250, 120);
        Clouds.drawClouds(graphics, 800, 100);
        Clouds.drawClouds(graphics, 1000, 50);

        int n = 0;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                Mountains.drawMountains(graphics, new int[]{n + 200, n + 400, n + 600}, new int[]{400, 150, 400}, new Color(0x90C2C2));
            } else {
                Ocean.drawOcean(graphics, new int[]{0, 0, 400}, new int[]{800, 400, 400});
            }
            Mountains.drawMountains(graphics, new int[]{n, n + 200, n + 400}, new int[]{400, 150, 400}, new Color(0x5C86C4));
            n += 400;
        }
        Hotel.drawHotel(graphics, 900, 400, 200,200, 0, 180);

        PalmTree.drawTree(graphics, 800, 500, 80, 40, 0,180);
        PalmTree.drawTree(graphics, 600, 500, 80, 40, 0,180);
        PalmTree.drawTree(graphics, 700, 400, 80, 40, 0,180);*/
    }
}
