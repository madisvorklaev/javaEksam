package JavaFX;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon {

    GridPane grid = new GridPane();
    Line line = new Line();
    Slider xStart = new Slider(0, 500, 0);
    Slider yStart = new Slider(0, 500, 0);
    Slider xEnd = new Slider(0, 500, 0);
    Slider yEnd = new Slider(0, 500, 0);

    public Joon(){
        startStage();
    }

    private void startStage(){
        Stage primaryStage = new Stage();
        primaryStage.setWidth(480);
        primaryStage.setHeight(720);
        primaryStage.setTitle("Joonista joon");
        line = new Line();

        Scene scene = new Scene(new Group());
        grid.add(xStart, 0,0);
        grid.add(xEnd, 0, 1);
        grid.add(yStart, 1, 0);
        grid.add(yEnd, 1, 1);
        grid.add(line, 0, 2);

        Group group = (Group) scene.getRoot();
        group.getChildren().add(grid);
        primaryStage.setScene(scene);
        primaryStage.show();

        createLine();
    }

    private void createLine(){
        xStart.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            line.setStartX((Double) uusVaartus);
        });

        xEnd.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            line.setStartY((Double) uusVaartus);
        });

        yStart.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            line.setEndX((Double) uusVaartus);
        });

        yEnd.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            line.setEndY((Double) uusVaartus);
        });
    }
}
