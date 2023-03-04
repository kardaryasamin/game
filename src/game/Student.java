package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class Student extends DynamicBody {
    private static final Shape studentShape = new BoxShape(1,2);
    private static int credits;

    private static final BodyImage image =
            new BodyImage("data/student.png", 4f);

    public Student(World world) {
        super(world, studentShape);
        addImage(image);
        this.credits=0;
    }

    public static int getCredits() {
        return credits;
    }

    public static void setCredits(int credits) {
        Student.credits = credits;
    }
}