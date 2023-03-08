package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class BlobCollision implements CollisionListener {
    private MainBlob myBlob;

    public BlobCollision(MainBlob myBlob) {
        this.myBlob = myBlob;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof EnemyBlob)
        {
            System.out.println("hey");
            if (myBlob.getHealth() == 1)
            {
                e.getOtherBody().destroy();
            }
            else
            {
                myBlob.setHealth(myBlob.getHealth() - 1);
            }
        }
    }
}