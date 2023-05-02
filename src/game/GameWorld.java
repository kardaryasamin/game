package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.sound.sampled.*;


public class GameWorld extends World {
    public Object getBlob;

    public GameWorld() {
        super();


        // make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));
        //platforms
        /*
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-25, 5f));

        Shape platformShape2 = new BoxShape(3.5f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(20, 5f));*/

        //castles have a platform with an angle because the soldiers would slide down
        Shape platformShape3 = new BoxShape(3.5f, 0.5f);
        StaticBody platform3 = new StaticBody(this, platformShape3);
        platform3.setPosition(new Vec2(18, -4f));
        platform3.setAngle(70);

        Shape platformShape4 = new BoxShape(3.5f, 0.5f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(-18, -4f));
        platform4.setAngle(-70);
        //castles

        Shape castleFormEnemy = new BoxShape(2, 16f);
        StaticBody castleEnemy = new StaticBody(this, castleFormEnemy);
        castleEnemy.setPosition(new Vec2(26, 0));
        castleEnemy.addImage(new BodyImage("data/castle1.png",32));

        Shape castleFormPlayer = new BoxShape(2, 16f);
        StaticBody castlePlayer = new StaticBody(this, castleFormPlayer);
        castlePlayer.setPosition(new Vec2(-26, 0));
        castlePlayer.addImage(new BodyImage("data/castle2.png",32));


        //mainBlobs
        EnemyBlob MainEnemy = new EnemyBlob(this);
        MainEnemy.setPosition(new Vec2(20   ,-7));

        MySoliders solider1 = new MySoliders(this);
        solider1.setPosition(new Vec2(-17, -3.5f));
        EnemySoliders Esolider1 = new EnemySoliders(this);
        Esolider1.setPosition(new Vec2(17, -3.5f));


        Esolider1.startWalking(-2);
        solider1.startWalking(2);
        BlobCollision touchEnemy = new BlobCollision(solider1);
        solider1.addCollisionListener(touchEnemy);

    }}


