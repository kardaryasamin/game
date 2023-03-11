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

public class EnemyBlob extends Blob implements ActionListener{
    int health = 1;

    private static final BodyImage EBlobimg = new BodyImage("data/Eblob.gif", 3f);

    public EnemyBlob(GameWorld world) {
        super(world);
        addImage(EBlobimg);

        // Add a timer to start walking after 3 seconds
        Timer timer = new Timer(3000, this);
        timer.setRepeats(false); // set to not repeat
        timer.start();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.startWalking(-1);
    }
}