package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public abstract class Blob extends Walker {
    private static final Shape BlobShape = new BoxShape(1.5f,1.5f);

    public Blob(World world) {
        super(world,BlobShape);
    }

}

