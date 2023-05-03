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
<<<<<<< HEAD
    //these above are commented because i dont want to delete them but worked hard for them
   // private final BodyImage heartHalf = new BodyImage("data/halfHeart.png", 2f);
    //private final BodyImage heartEmpty = new BodyImage("data/emplyHeart.png", 2f);
    //private final BodyImage heartFull = new BodyImage("data/fullHeart.png", 2f);



//sets the health for the character
=======


    //sets the health for the character
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
    int health = 3;
    boolean alive = true;
    private static final BodyImage EBlobimg = new BodyImage("data/Eblob.gif", 3f);

<<<<<<< HEAD
//to stop the shooting after it died:
=======
    //to stop the shooting after it died:
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
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
<<<<<<< HEAD
            //more of the heart code
         /*   DynamicBody heart = new DynamicBody(getWorld());
            heart.setPosition(new Vec2(0, 0));
            heart.addImage(heartFull);
            DynamicBody heart1 = new DynamicBody(getWorld());
            heart1.setPosition(new Vec2(0, 10));
            heart1.addImage(heartFull);
            DynamicBody heart2= new DynamicBody(getWorld());
            heart2.setPosition(new Vec2(0, 5));
            heart2.addImage(heartFull);*/
=======

>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb

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
<<<<<<< HEAD
                            //heart1.setPosition(new Vec2(100, 100));//   heart.removeAllImages();
=======
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb

                            //to stop the game after the main char dies
                            getWorld().stop();
                            myblob.destroy();


                        } else {
                            myblob.setHealth(myblob.getHealth() - 1);
<<<<<<< HEAD
                            //           heart.removeAllImages();
                         //   heart1.addImage(heartHalf);
                         //   heart2.setPosition(new Vec2(500, 50));//   heart.removeAllImages();
=======
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
                            System.out.println("no");
                            bullet.destroy();

                        }


                        bullet.destroy();
                    }


                    MySoliders blobs;
                    if (e.getOtherBody() instanceof MySoliders) {
                        blobs = (MySoliders) e.getOtherBody();


<<<<<<< HEAD
                            blobs.destroy();
=======
                        blobs.destroy();
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb

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
<<<<<<< HEAD

=======
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
