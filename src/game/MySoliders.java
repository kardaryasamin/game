package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MySoliders extends Soliders {
    public int health=1;
   private static final BodyImage SImg = new BodyImage("data/Blob.gif", 1f);

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public MySoliders(World world) {
        super(world);
      addImage(SImg);
    }
}