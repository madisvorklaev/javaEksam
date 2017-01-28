package JavaFX;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 *
*/
public class FooridUnenaos{
    int radius;
    int xCoordinate;
    int yCoordinate;
    Paint color;
    StackPane stack;
    Circle circle;

    public FooridUnenaos(){
        startStage();
    }

    private void startStage() {

        Stage primaryStage = new Stage();
        stack = new StackPane();
        circle = new Circle();

        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        generateCircles();
       // mouse();
    }

/*
    private void mouse(){
        stack.setOnMouseMoved(event ->  {
            Circle circle = (Circle) event.getTarget();
            if (circle.getId().equals("ring")){
                circle.setFill(Color.GREEN);
            }
            });
    }
    */
    public void generateCircles(){
        for (int i = 0; i < 600 ; i++) {
            radius = 10;
            xCoordinate = (int) (Math.random() * 490-250);
            yCoordinate = (int) (Math.random() * 490-250);
            color = Color.RED;
            Circle circle = new Circle(radius);
            circle.setTranslateX(xCoordinate);
            circle.setTranslateY(yCoordinate);
            circle.setFill(color);
            circle.setId("ring");

            circle.setOnMouseEntered(event -> {
                circle.setFill(Color.GREEN);
            });

            stack.getChildren().add(circle);

        }
    }
}