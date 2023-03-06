package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GameWorld extends World {
    public GameWorld() {
        super();

        // make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make the character
       //to be deleted
        Student student = new Student(this);
        student.setPosition(new Vec2(7, -9));
        //deleted
        //mainBlobs
    /*    Blob myBlob = new Blob(this);
        myBlob.setPosition(new Vec2 (8,-7));
        EnemyBlob MainEnemy = new EnemyBlob(this);
        MainEnemy.setPosition(new Vec2 (-8,-7));
        soldier mysoldiers = new soldier(this);
        mysoldiers.setPosition(new Vec2 (27,-2f));
*/

        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-25, 5f));

        Shape platformShape2 = new BoxShape(3.5f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(25, 5f));


        Shape platformShape3 = new BoxShape(3.5f, 0.5f);
        StaticBody platform3 = new StaticBody(this, platformShape3);
        platform3.setPosition(new Vec2(25, -3f));
        platform3.setAngle(60);

        Shape platformShape4 = new BoxShape(3.5f, 0.5f);
        StaticBody platform4 = new StaticBody(this, platformShape4);
        platform4.setPosition(new Vec2(-25, -3f));
        platform4.setAngle(-60);

        Shape castleFormEnemy= new BoxShape(2,16f);
        StaticBody castleEnemy = new StaticBody(this, castleFormEnemy);
        castleEnemy.setPosition(new Vec2(28,5f));

        Shape castleFormPlayer= new BoxShape(2,16f);
        StaticBody castlePlayer = new StaticBody(this, castleFormPlayer);
        castlePlayer.setPosition(new Vec2(-28,5f));
    }
}