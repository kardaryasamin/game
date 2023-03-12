package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Game {

    public Game() {

        GameWorld world = new GameWorld();
//wo6,l6,l555555555555555lllllllllllllllllll55lllllllllllllll5lr,,,,,,,5rld
        Shape shape = new BoxShape(550, 1f);
        StaticBody ground = new StaticBody(world, shape);

        ground.setPosition(new Vec2(0f, -11.5f));
        MainBlob myBlob = new MainBlob(world);

        myBlob.setPosition(new Vec2 (-17,-7));
        BlobController controller = new BlobController(myBlob);
        GameView view = new GameView(world, 1200, 500, myBlob);
        final JFrame frame = new JFrame("City Game");


        frame.add(view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        view.addKeyListener(controller);


        view.requestFocus();
        world.start();

        // view.setBackground(new BodyImage("data/background.png", 20f));
    }

    /** Run the game. */
    public static void main(String[] args) {
        new Game();

    }
}



