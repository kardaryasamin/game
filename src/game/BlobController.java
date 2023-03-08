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
public class BlobController implements KeyListener{
        MainBlob controlBlob;

        public BlobController(MainBlob controlBlob) {
                this.controlBlob = controlBlob;
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                // other key commands omitted
                if (code == KeyEvent.VK_RIGHT) {
                        controlBlob.startWalking(1);

                } else if (code == KeyEvent.VK_2) {
                        controlBlob.startWalking(-1);
                }
        }


        @Override
        public void keyReleased(KeyEvent e) {
        }

        }