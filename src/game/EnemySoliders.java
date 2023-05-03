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


public class EnemySoliders extends Soliders  implements ActionListener {
    private static final BodyImage ESImg = new BodyImage("data/EBlob.gif", 1f);
    private int count = 0;
<<<<<<< HEAD
///to have a delay before coming
=======
    ///to have a delay before coming
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
    Timer timer = new Timer(10000, this);

    public EnemySoliders(World world) {
        super(world);
        addImage(ESImg);

        timer.setInitialDelay(5000);
        timer.start();
        timer.setRepeats(false);

    }

    public void actionPerformed(ActionEvent e) {
        //create and move the new soldiers
        EnemySoliders hey = new EnemySoliders(getWorld());
<<<<<<< HEAD
        hey.setPosition(new Vec2(23, -2));
=======
        hey.setPosition(new Vec2(17, -3.5f));
>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
        hey.startWalking(-2);
        count++;

        timer.stop();

    }

}


<<<<<<< HEAD
=======

>>>>>>> eba8fcdd61dc6acbf5bb489ed5eee971a6bf00fb
