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
    private static final Shape BlobShape = new BoxShape(3f,3f);
    private static final BodyImage MainBlobImg = new BodyImage("data/Blob.gif", 3f);

    //private int x ,y;

   /* public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }*/

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



}