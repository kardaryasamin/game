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

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;


public class MainBlob extends Walker {
    private static final Shape BlobShape = new BoxShape(1.5f,1.5f);
    private static final BodyImage MainBlobImg = new BodyImage("data/Blob.gif", 3f);

    int health=3;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public MainBlob(World world) {
        super(world,BlobShape);
        addImage(MainBlobImg);

    }
    //the use of shoot is in the controller class

    public  void shoot(int x, int y)
    {
        //create the bullet
        Shape shape = new CircleShape(0.2f);
        DynamicBody bullet = new DynamicBody(this.getWorld(),shape);
        bullet.setPosition(new Vec2 (x,y-0.9f));
        bullet.isBullet();
        bullet.setLinearVelocity(new Vec2(-getPosition().x+50, y - getPosition().y-10).mul(1)); // set bullet velocity towards mouse click

        bullet.addCollisionListener(new CollisionListener() {
            @Override
            public void collide(CollisionEvent e) {
                if (e.getOtherBody() instanceof EnemyBlob) {
                    // Reduce enemy's health and destroy the bullet
                    EnemyBlob enemy = (EnemyBlob) e.getOtherBody();

                    if (enemy.getHealth() == 0)
                    {
                        e.getOtherBody().destroy();
                        enemy.setAlive(false);
                        bullet.destroy();
                    }
                    else
                    {
                        enemy.setHealth(enemy.getHealth() - 1);
                        bullet.destroy();


                    }
                }
                else if (e.getOtherBody() instanceof EnemySoliders) {
                    // Reduce enemy's health and destroy the bullet
                    EnemySoliders enemy = (EnemySoliders) e.getOtherBody();

                    if (enemy.getHealth() == 1)
                    {
                        e.getOtherBody().destroy();
                    }
                    else
                    {
                        enemy.setHealth(enemy.getHealth() - 1);
                    }

                }

            }
        });
    }

}


