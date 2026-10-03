package lab;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Entity {

	private final Level level;
	private final Point2D position;
	private final Dimension2D size;

	public Entity(Level level) {
		this(level, new Point2D(200, 100), new Dimension2D(30, 20));
	}

	public Entity(Level level, Point2D position, Dimension2D size) {
		this.level = level;
		this.position = position;
		this.size = size;
	}

	public void draw(GraphicsContext gc) {
		gc.save();

		gc.restore();
	}

	public void simulate(double delay) {

	}

}
