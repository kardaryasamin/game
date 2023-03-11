package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EnemyBlob extends Blob implements ActionListener{
    int health = 1;
    boolean alive = true;

    private static final BodyImage EBlobimg = new BodyImage("data/Eblob.gif", 3f);

    public EnemyBlob(GameWorld world) {
        super(world);
        addImage(EBlobimg);

        // Add a timer to start walking after 3 seconds
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                EnemyBlob.this.startWalking(-1);
            }

        });
        timer.setRepeats(false); // set to not repeat
        timer.start();

        Timer ShootTimer = new Timer(4000, new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                shoot((int)getPosition().x,(int) getPosition().y);}


        });
        ShootTimer.setRepeats(true);
        ShootTimer.start();

    }




    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) alive = false;
    }



    public void shoot (int x, int y) {

        Shape shape = new CircleShape(0.2f);
        DynamicBody bullet = new DynamicBody(getWorld(), shape);
        bullet.setPosition(new Vec2(x, y -0.5f));
        bullet.isBullet();
        bullet.setLinearVelocity(new Vec2(-getPosition().x + 50, y - getPosition().y +20).mul(-1f));
        bullet.addCollisionListener(new CollisionListener() {
            @Override
            public void collide(CollisionEvent e) {

                MainBlob myblob = null;
                if (e.getOtherBody() instanceof MainBlob) {
                    myblob = (MainBlob) e.getOtherBody();

                    if (myblob.getHealth() == 1) {
                        myblob.destroy();

                    } else {
                        myblob.setHealth(myblob.getHealth() - 1);
                    }
                    bullet.destroy();
                }
                MySoliders blobs;
                if (e.getOtherBody() instanceof MySoliders) {
                    blobs = (MySoliders) e.getOtherBody();


                    if (blobs.getHealth() == 1) {
                        blobs.destroy();

                    } else {
                        blobs.setHealth(blobs.getHealth() - 1);
                    }
                    bullet.destroy();
                }


            }
        });

    }

    @Override
    public void destroy(){
        super.destroy();
        alive=false;
    }
    public void actionPerformed(ActionEvent e) {
        // Add your code to handle the action event here
    }
}
