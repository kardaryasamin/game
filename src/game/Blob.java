package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Blob extends DynamicBody {

    private static final Shape BlobShape = new BoxShape(3f,3f);
  //  private static final BodyImage Blobimg = new BodyImage("data/Blob.gif", 3f);

    public Blob(World world) {
        super(world);
        //addImage(Blobimg);
    }
}