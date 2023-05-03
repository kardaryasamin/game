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
    //shapes and stuff
    private static final Shape BlobShape = new BoxShape(1.5f,1.5f);
    private static final BodyImage MainBlobImg = new BodyImage("data/Blob.gif", 3f);
    int health=3;

<<<<<<< HEAD
=======
    //this var counts the dead enemy soldiers
    public int countDead= 0;

    //getters and setters
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

<<<<<<< HEAD
=======
    public int getCountDead() {
        return countDead;
    }

    public void setCountDead(int countDead) {
        this.countDead = countDead;
    }

>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
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
<<<<<<< HEAD
=======
                System.out.println(countDead);
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
                if (e.getOtherBody() instanceof EnemyBlob) {
                    // Reduce enemy's health and destroy the bullet
                    EnemyBlob enemy = (EnemyBlob) e.getOtherBody();

<<<<<<< HEAD
                    if (enemy.getHealth() == 0)
=======
                    //kill the enemyblob if his life is 1 and if you have killed 3 soldiers stop the game
                    if (enemy.getHealth() == 1)
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
                    {
                        e.getOtherBody().destroy();
                        enemy.setAlive(false);
                        bullet.destroy();
                        if(getCountDead()>3)
                        {
                            //stop the game
                            getWorld().stop();
                        }
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
<<<<<<< HEAD
                    else
                    {
                        enemy.setHealth(enemy.getHealth() - 1);
                    }
=======
                    countDead++;
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb

                }

            }
        });
    }

}


<<<<<<< HEAD
=======

>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
