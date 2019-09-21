package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.HashMap;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControllerForOzelVerilerinIslenmesi implements Initializable {
    HashMap<TitledPane,String> titlePanes=new HashMap<>();


    @FXML
    private TitledPane irk;

    @FXML
    private JFXCheckBox c1512;

    @FXML
    private TitledPane siyasi;

    @FXML
    private JFXCheckBox c1543;

    @FXML
    private JFXCheckBox c1553;

    @FXML
    private JFXCheckBox c1563;

    @FXML
    private JFXCheckBox c1573;

    @FXML
    private TitledPane felsefi;

    @FXML
    private TitledPane kilik;

    @FXML
    private TitledPane dernek;

    @FXML
    private TitledPane saglik;

    @FXML
    private JFXCheckBox c1521;

    @FXML
    private TitledPane cinsel;

    @FXML
    private TitledPane ceza;

    @FXML
    private TitledPane biyometrik;

    @FXML
    private TitledPane genetik;

    @FXML
    private HBox hBox;

    @FXML
    private JFXCheckBox diger;

    @FXML
    private JFXButton cikart;

    @FXML
    private JFXButton ekle;

    @FXML
    private VBox vBox;

    @FXML
    void devam(ActionEvent e) {
        secimleriAl();
        System.out.println(Envanter.getInstance().getAmac().toString());
    }

    @FXML
    void diger(ActionEvent event) {
        if(diger.isSelected()){
            System.out.println("Diger secildi");
            vBox.setVisible(true);
            if(vBox.getChildren().size()== 0){
                JFXTextField jfxTextField = new JFXTextField();
                jfxTextField.setPromptText("Lutfen veri giriniz");
                jfxTextField.setStyle("-fx-background-color:  #009975; -fx-background-radius:  10;-fx-text-fill: white;");
                vBox.getChildren().add(jfxTextField);
            }

            ekle.setVisible(true);
        }
        if(!diger.isSelected()){
            System.out.println("Diger secilmedi");
            ekle.setVisible(false);
            cikart.setVisible(false);
            vBox.setVisible(false);
        }
    }

    @FXML
    void ekle(ActionEvent event) {
        JFXTextField jfxTextField = new JFXTextField();
        jfxTextField.setPromptText("Lutfen veri giriniz");
        jfxTextField.setStyle("-fx-background-color:  #009975; -fx-background-radius:  10;-fx-text-fill: white;");
        jfxTextField.setVisible(true);
        JFXButton button = new JFXButton("Sil");
        vBox.getChildren().add(jfxTextField);
        cikart.setVisible(true);
    }
    @FXML
    void cikart(ActionEvent event) {
        vBox.getChildren().remove(vBox.getChildren().size()-1);
        if(vBox.getChildren().size()== 0){
            cikart.setVisible(false);
        }
    }

    @FXML
    void geri(ActionEvent event) {
        Switch.changeStage("VerilerinIslenmesi",800,600,cikart);
    }

    public void secimleriAl(){
        HashMap<String ,String> secimler =new HashMap<>();
        for(TitledPane x : titlePanes.keySet()){
            for( Node y : x.getChildrenUnmodifiable()){
                if(((JFXCheckBox)y).isSelected()){
                    secimler.put(((JFXCheckBox)y).getText(),x.getText());
                }
            }
        }
        for(int i = 0 ; i< vBox.getChildren().size(); i++){
            secimler.put(((JFXTextField)vBox.getChildren().get(i)).getText(),"Diğer");
        }
        System.out.println(secimler);
        Envanter.getInstance().getOzelVerilerinIslenmesi().setOzelIslenenVeriler(secimler);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       titlePanes.put(irk,irk.getText());
       titlePanes.put(siyasi,siyasi.getText());
       titlePanes.put(cinsel,cinsel.getText());
       titlePanes.put(felsefi,felsefi.getText());
       titlePanes.put(saglik,saglik.getText());
       titlePanes.put(dernek,dernek.getText());
       titlePanes.put(ceza,ceza.getText());
       titlePanes.put(biyometrik,biyometrik.getText());
       titlePanes.put(genetik,genetik.getText());
       titlePanes.put(kilik,kilik.getText());

    }
}
