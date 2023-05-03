package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import javax.swing.JFrame;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.sound.sampled.*;
public class BlobController implements KeyListener {
        //this class controlls the main walker
        MainBlob controlBlob;
        int x, y;


        public BlobController(MainBlob controlBlob) {
                this.controlBlob = controlBlob;
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
                //to walk on right and left, shoot on space and use shift to spawn soldiers
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_RIGHT) {
                        controlBlob.startWalking(5);

                } else if (code == KeyEvent.VK_LEFT) {
                        controlBlob.startWalking(-5);
                } else if (code == KeyEvent.VK_SPACE) {

                        Vec2 characterPosition = controlBlob.getPosition();
                        System.out.println(characterPosition);
                        int s = (int) characterPosition.x;
                        int n = (int) characterPosition.y;
                        controlBlob.shoot(s, n);
                }
                else if (code==KeyEvent.VK_SHIFT)
                {
                        MySoliders solider1 = new MySoliders(this.controlBlob.getWorld());
                        solider1.setPosition(new Vec2(-17, -3.5f));

                        solider1.startWalking(2);
                        BlobCollision touchEnemy = new BlobCollision(solider1);
                        solider1.addCollisionListener(touchEnemy);

                }
        }


        @Override
        public void keyReleased(KeyEvent e) {
                int code = e.getKeyCode();

                if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT) {
                        controlBlob.stopWalking();
                }

        }
}
