package org.example.guieventos;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Canvas canvas;

    private GraphicsContext gc;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();

        // Otra forma de definir un evento
        canvas.setOnMouseExited(
                event -> gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight())
        );

        canvas.setOnMousePressed(
               event -> System.out.println("Pressed")
        );
    }

    @FXML
    public void dibujar(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getX() + ", " + mouseEvent.getY());
        System.out.println("Boton: " + mouseEvent.getButton());
        System.out.println("Clics: " + mouseEvent.getClickCount());

        // generar una linea azul
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(10, 10, 300, 300);

        // generar un ovalo rojo y relleno rosa
        gc.setStroke(Color.RED);
        gc.setFill(Color.PINK);
        gc.strokeOval(40, 40, 100, 150);
        gc.fillOval(40, 40, 100, 150);

        // generar un rectangulo amarillo con relleno RGB (125, 45, 23)
        gc.setStroke(Color.BLUE);
        gc.setFill(Color.rgb(125, 45, 23));
        gc.strokeRect(300, 300, 100, 150);
        gc.fillRect(300, 300, 100, 150);

        // Crear un triangulo gris
        gc.setStroke(Color.GRAY);
        gc.setFill(Color.GRAY);
        double[] xs = {100, 250, 175};
        double[] ys = {250, 250, 100};
        gc.strokePolygon(xs, ys, 3);
        gc.fillPolygon(xs, ys, 3);

    }
}