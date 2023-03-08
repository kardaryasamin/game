package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.sound.sampled.*;

public class MainBlob extends Walker {
    private static final Shape BlobShape = new BoxShape(1.5f,1.5f);
    private static final BodyImage MainBlobImg = new BodyImage("data/Blob.gif", 3f);
    int health=3;
    public MainBlob(World world) {
        super(world,BlobShape);
         addImage(MainBlobImg);
    }
    public  void shoot( int x, int y)
    {
        Shape shape = new CircleShape(0.2f);
        DynamicBody bullet = new DynamicBody(this.getWorld(),shape);
        bullet.setPosition(new Vec2 (x,y));
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}