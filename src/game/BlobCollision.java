package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class BlobCollision implements CollisionListener {
    private MySoliders enemy;

    public BlobCollision(MySoliders enemy) {
        this.enemy = enemy;
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


