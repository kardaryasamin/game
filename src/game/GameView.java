package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;
public class GameView extends UserView {
    public GameView(GameWorld world, int width, int height) {
        super(world, width, height);
    }
}