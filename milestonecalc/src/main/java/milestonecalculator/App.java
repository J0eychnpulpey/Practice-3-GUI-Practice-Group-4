package milestonecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class triggers the JavaFX application. It is the start point of the application.
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException { // Suppressing warning for exports
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException { 
        scene.setRoot(loadFXML(fxml)); // Load the FXML file and set it as the root of the scene
    }

    private static Parent loadFXML(String fxml) throws IOException { 
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) { // Main method to launch the application
        launch();
    }

}

