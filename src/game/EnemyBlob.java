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

 //   private static final Shape EBlobShape = new BoxShape(3f,3f);
    private static final BodyImage EBlobimg = new BodyImage("data/Blob.gif", 3f);



    public EnemyBlob(World world) {
        super(world);
        addImage(EBlobimg);
    }
}