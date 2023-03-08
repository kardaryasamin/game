package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EnemyBlob extends Blob {
    int health=5;

    private static final BodyImage EBlobimg = new BodyImage("data/Blob.gif", 3f);

    public EnemyBlob(World world) {
        super(world);
        addImage(EBlobimg);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}