package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.StaticBody;

public class BlobCollision implements CollisionListener {
    private MySoliders soldiers;

    public BlobCollision(MySoliders soldiers) {
        this.soldiers = soldiers;

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




