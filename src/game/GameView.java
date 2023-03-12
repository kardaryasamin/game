package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import com.sun.tools.javac.Main;
import org.jbox2d.common.Vec2;
import javax.swing.*;
import java.awt.*;

import java.awt.geom.AffineTransform;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class GameView extends UserView {
    private MainBlob myblob;
    public GameView(GameWorld world, int width, int height, MainBlob myblob) {
        super(world, width, height);
         this.myblob=myblob;
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        Image image = new ImageIcon("data/background.png").getImage();

        g.drawImage(image, 0, 0, this); // draw the scaled and translated image

    }

    @Override
    public void paintForeground(Graphics2D g) {
        //this part is for the hearts and the health
        super.paintForeground(g);

        if(myblob.health==3)
        {

            Image image = new ImageIcon("data/Heart1.png").getImage();
            g.drawImage(image, 0, 0,100,30, this);
        }
        if(myblob.health==2)
        {

            Image image = new ImageIcon("data/Heart2.png").getImage();
            g.drawImage(image, 0, 0,100,30, this);
        }
        if(myblob.health==1)
        {

            Image image = new ImageIcon("data/Heart3.png").getImage();
            g.drawImage(image, 0, 0,100,30, this);
        }
    }
}

