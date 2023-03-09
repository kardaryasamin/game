package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class BlobCollision implements CollisionListener {
    private EnemySoliders enemy;

    public BlobCollision(EnemySoliders enemy) {
        this.enemy = enemy;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof EnemySoliders)
        {
            System.out.println("hey");
            if (enemy.getHealth() == 1)
            {
                e.getOtherBody().destroy();
            }
            else
            {
                enemy.setHealth(enemy.getHealth() - 1);
            }
        }
    }
}


