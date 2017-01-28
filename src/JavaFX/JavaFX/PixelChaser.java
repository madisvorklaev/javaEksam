package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser {

    public PixelChaser(){
        startStage();
    }

    Pane pane;

    private void startStage() {

        Stage stage = new Stage();
        pane = new Pane();


        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();


        rectangles();
    }

    private void rectangles(){
        for (int i = 0; i < 35 ; i++) {
           Rectangle rec = new Rectangle();
            rec.setX((int) (Math.random() * 500));
            rec.setY((int) (Math.random() * 500));
            rec.setWidth(70);
            rec.setHeight(50);

            rec.setOnMouseClicked(event -> {
                if (rec.getId() == "Clicked!"){
                    rec.setVisible(false);
                } else {
                    rec.setWidth(35);
                    rec.setHeight(25);
                    rec.setId("Clicked!");
                }


            });
            pane.getChildren().add(rec);
        }
    }

}
