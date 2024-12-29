import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class DrawRainbowController{

	@FXML private Canvas canvas;



	private final Color[] colors = {

	Color.WHITE, Color.WHITE, color.VIOLET,Color.INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};


@FXML
void drawRainbowButtonPressed(ActionEvent event){

GraphicsContext gc = canvas.getGraphicsContext2D();

final int radius = 20;

final double centerX = canvas.getWidth() / 2;

final double mayX = canvas.getHeight() - 10;

for(int count = colors.length; count > 0; count--){

	gc.setFill(colors[count - 1]);

	gc.fillArc(centerX - count * radius, maxY - count * radius, count * radius * 2, count * radius * 2, 0, 180, ArcType.OPEN);


}


}

}