package sample;

import javafx.scene.Node;
import javafx.stage.Stage;

import static sample.Main.stages;

public interface Switch {
     static void changeStage(String name,int width , int height , Node x ){
        Stage stage = (Stage) x.getScene().getWindow();
        stage.hide();
        Stage newStage = stages.get(name);
        newStage.setWidth(width);
        newStage.setHeight(height);
        newStage.show();
    }
}
