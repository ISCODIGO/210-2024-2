package org.example.guievents;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Canvas canvas;
    @FXML
    private TextField originX, originY, endX, endY;
    private GraphicsContext gc;
    private String currentShape = "line"; // Default shape

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
    }

    public void handleDrawShape() {
        double x = Double.parseDouble(originX.getText());
        double y = Double.parseDouble(originY.getText());
        double ex = Double.parseDouble(endX.getText());
        double ey = Double.parseDouble(endY.getText());

        switch (currentShape) {
            case "circle":
                gc.fillOval(x - 25, y - 25, 50, 50);
                break;
            case "square":
                gc.fillRect(x - 25, y - 25, 50, 50);
                break;
            case "line":
                gc.strokeLine(x, y, ex, ey);
                break;
        }
    }

    public void handleClearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
