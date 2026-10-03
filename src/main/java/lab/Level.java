package lab;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Level {

	private final Obstacle obstacle1;
	private final Player player;
	private final double width;
	private final double height;

	public Level(double width, double height) {
		this.width = width;
		this.height = height;
		obstacle1 = new Obstacle(this, new Point2D(300, 200), new Dimension2D(80, 40));
        player = new Player(this);
		player2 = new Player(this, new Point2D(20, 250), new Point2D(100, -20));
	}

	public void draw(GraphicsContext gc) {
		gc.save();
		gc.setFill(Color.WHITE);
		gc.clearRect(0, 0, width, height);
		obstacle1.draw(gc);
		player.draw(gc);
		gc.restore();
	}

	public void simulate(double delay) {

	}

}
