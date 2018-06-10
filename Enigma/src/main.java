import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) { // LAUNCHER GRAFICO, IMPOSTA CONTENUTI PER LA GRAFICA
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("FxEnigma.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();

        Enigma mac = new Enigma(new Rotore3(0), new Rotore2(0), new Rotore1(0), new Riflettore(0));
    }
}
