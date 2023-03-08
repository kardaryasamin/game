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

        //make the ground
        Shape shape = new BoxShape(550, 1f);
        StaticBody ground = new StaticBody(world, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make a platform


        //3. make a view to look into the game world
        // UserView view = new UserView(world, 500, 500);
        GameView view = new GameView(world, 1200, 500);

        //optional: draw a 1-metre grid over the view
        //view.setGridResolution(1);


        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
       //  JFrame debugView = new DebugViewer(world, 500, 500);
        BlobController controller = new BlobController(world.getBlob);

        view.requestFocus();
        view.addKeyListener(controller);
        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();

    }
}
