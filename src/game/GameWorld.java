package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    public GameWorld() {
        super();
/*
        // make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make the character
        Student student = new Student(this);
        student.setPosition(new Vec2(7, -9));
*/
        //**move** here the rest of the code from Gave.java that
        //populates the World - add platforms, Student, etc.
        //(don't add anything related to the view)


        //2. populate it with bodies (ex: platforms, collectibles, characters)

      //make a ground platform
        Shape shape = new BoxShape(30, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make a suspended platform
        Shape platformShape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-8, -4f));

        //make a character (with an overlaid image)
        Student student = new Student(this);
        student.setPosition(new Vec2(7, -9));
        student.setCredits(student.getCredits()+15);

    }
}