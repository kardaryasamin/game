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


    //sets the health for the character
    int health = 3;
    boolean alive = true;
    private static final BodyImage EBlobimg = new BodyImage("data/Eblob.gif", 3f);

    //to stop the shooting after it died:
    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

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
        //to stop shooting after dead
        if(this.alive) {


            //create the bullet and set it
            Shape shape = new CircleShape(0.2f);
            DynamicBody bullet = new DynamicBody(getWorld(), shape);
            bullet.setPosition(new Vec2(x, y - 0.5f));
            bullet.isBullet();
            bullet.setLinearVelocity(new Vec2(-getPosition().x + 50, y - getPosition().y + 20).mul(-1f));
            bullet.setFillColor(Color.ORANGE);

            //collision for the main char life
            bullet.addCollisionListener(new CollisionListener() {
                @Override
                public void collide(CollisionEvent e) {

                    MainBlob myblob = null;


                    if (e.getOtherBody() instanceof MainBlob) {
                        myblob = (MainBlob) e.getOtherBody();

                        if (myblob.getHealth() == 1) {

                            //to stop the game after the main char dies
                            getWorld().stop();
                            myblob.destroy();


                        } else {
                            myblob.setHealth(myblob.getHealth() - 1);
                            System.out.println("no");
                            bullet.destroy();

                        }


                        bullet.destroy();
                    }


                    MySoliders blobs;
                    if (e.getOtherBody() instanceof MySoliders) {
                        blobs = (MySoliders) e.getOtherBody();


                        blobs.destroy();

                        bullet.destroy();
                    }
                    //    bullet.destroy();

                }
            });
        }
    }
    // i dont know what this is really buyt im too scared to delete it
    @Override
    public void destroy(){
        super.destroy();
        alive=false;
    }
    public void actionPerformed(ActionEvent e) {

        // Add your code to handle the action event here
    }
}
