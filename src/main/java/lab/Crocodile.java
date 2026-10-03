package lab;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public class Crocodile extends Entity {
    private final Level level;
    private Point2D position;
    private Point2D speed;

    public Crocodile(Level level) {
        this(level, new Point2D(50,50), new Point2D(40, 80));
    }

    public Crocodile(Level level, Point2D position, Point2D speed) {
        this.level = level;
        this.position = position;
        this.speed = speed;
    }

    public void draw(GraphicsContext gc) {
        gc.save();

        gc.restore();
    }

    public void simulate(double delay) {

    }

}
