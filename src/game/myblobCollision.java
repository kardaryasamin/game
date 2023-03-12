package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import com.sun.tools.javac.Main;

public class myblobCollision implements CollisionListener {
    //this class is for the main char to lose life after touching the enemy
    private MainBlob myblob;

    public myblobCollision(MainBlob myblob) {
        this.myblob = myblob;

    }

    @Override
    public void collide(CollisionEvent e) {
        MainBlob myblob = (MainBlob) e.getOtherBody();

        if (e.getOtherBody() instanceof EnemyBlob)
        {
            myblob.setHealth(myblob.health-1);
        }
        else   if (e.getOtherBody() instanceof EnemySoliders)
        {
            myblob.setHealth(myblob.health-1);


        }
    }
}


