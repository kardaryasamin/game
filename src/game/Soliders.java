package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public abstract class Soliders extends Walker  {

    private static final Shape SShape = new BoxShape(1f,1f);

    int health=1;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Soliders(World world) {
        super(world, SShape);
    }


}