package sample;

import Backend.Context.Envanter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Main extends Application {
    public static HashMap<String,Stage> stages = new HashMap<>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        linkedListDoldur();
        Envanter.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("Organizasyon.fxml"));
        primaryStage.setScene(new Scene(root, 700  , 500));
        stages.put("Organizasyon",primaryStage);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public void linkedListDoldur(){
        stages.put("Surec",createStage("Surec.fxml"));
        stages.put("Surec2",createStage("Surec2.fxml"));
        stages.put("Surec3",createStage("Surec3.fxml"));
        stages.put("Amac",createStage("Amac.fxml"));
        stages.put("VerilerinIslenmesi",createStage("VerilerinIslenmesi.fxml"));
        stages.put("OzelVerilerinIslenmesi",createStage("OzelVerilerinIslenmesi.fxml"));

    }
    public Stage createStage(String fxmlName ){
        Parent root;
        Stage stage = new Stage();
        try {
            root = FXMLLoader.load(getClass().getResource(fxmlName));
            Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    return stage;
    }

}
