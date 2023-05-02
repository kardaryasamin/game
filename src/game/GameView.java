package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.*;
import java.awt.*;

import java.awt.geom.AffineTransform;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class GameView extends UserView {
    public GameView(GameWorld world, int width, int height) {
        super(world, width, height);
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        Image image = new ImageIcon("data/background.png").getImage();

        g.drawImage(image, 0,0,this); // draw the scaled and translated image

    }
}
