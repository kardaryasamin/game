package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EnemySoliders extends Soliders {
    private static final BodyImage ESImg = new BodyImage("data/Blob.gif", 1f);


    public EnemySoliders(World world) {
        super(world);
        addImage(ESImg);
    }
}