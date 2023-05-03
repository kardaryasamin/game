package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.StaticBody;

public class BlobCollision implements CollisionListener {
<<<<<<< HEAD
    private MySoliders enemy;
    public BlobCollision(MySoliders enemy) {
        this.enemy = enemy;
=======
    private MySoliders soldiers;

    public BlobCollision(MySoliders soldiers) {
        this.soldiers = soldiers;
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb

    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof EnemySoliders)
        {
            e.getOtherBody().destroy();
            e.getReportingBody().destroy();


        }
    }
}



<<<<<<< HEAD
=======

>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
