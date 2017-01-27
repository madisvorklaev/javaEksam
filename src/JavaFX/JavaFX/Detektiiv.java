package JavaFX;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv {
    public Detektiiv(){
        startStage();
    }

    private void startStage(){
       // @Override
       // public void start(Stage primaryStage) throws Exception {
            Stage primaryStage = new Stage();
            StackPane stack = new StackPane();
            Scene scene = new Scene(stack, 500, 500);
            primaryStage.setScene(scene);

            Circle ring1 = new Circle(30);
            double x = (double) Math.random() * 220;
            double y = (double) Math.random() * 220;
            System.out.println(x + "  " + y);
            ring1.setTranslateX(x);
            ring1.setTranslateY(y);
            ring1.setFill(Color.WHITE);

            Circle ring2 = new Circle(30);
            double a = (double) Math.random() * 220;
            double b = (double) Math.random() * 220;
            System.out.println(a + "  " + b);
            ring2.setTranslateX(a);
            ring2.setTranslateY(b);
            ring2.setFill(Color.WHITE);

            Circle ring3 = new Circle(30);
            double c = (double) Math.random() * 220;
            double d = (double) Math.random() * 220;
            System.out.println(c + "  " + d);
            ring3.setTranslateX(c);
            ring3.setTranslateY(d);
            ring3.setFill(Color.WHITE);


            stack.getChildren().add(ring1);
            stack.getChildren().add(ring2);
            stack.getChildren().add(ring3);

            primaryStage.show();

            ring1.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    ring1.setFill(Color.DARKMAGENTA);
                }
            });

            ring2.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    ring2.setFill(Color.ROYALBLUE);
                }
            });

            ring3.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    ring3.setFill(Color.MAROON);
                }
            });

        }
    }

