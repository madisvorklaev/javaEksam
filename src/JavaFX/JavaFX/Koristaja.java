package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja {
    public Koristaja(){
            startStage();
        }


        private void startStage() {

            Stage stage = new Stage();
            Pane pane = new Pane();
            Scene scene = new Scene(pane, 500, 500);
            stage.setScene(scene);
            stage.show();

            Label label = new Label("KORISTA JA NÜHI");
            label.setTranslateX(100);
            label.setTranslateY(250);
            label.setScaleX(2);
            label.setScaleY(2);
            label.setRotate(10);

            pane.getChildren().add(label);

            for (int i = 0; i < 1000 ; i++) {
                Circle c = new Circle(10);
                c.setTranslateX((int) (Math.random() * 500));
                c.setTranslateY((int) (Math.random() * 500));

                c.setOnMouseEntered(event -> {
                    c.setVisible(false);
                });
                pane.getChildren().add(c);
            }
        }

}
