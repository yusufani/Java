package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Stack;

import static sample.Main.stages;

public class ControllerForSurec2 implements Initializable {

    @FXML
    private JFXCheckBox calisan;

    @FXML
    private JFXCheckBox tedarikci;

    @FXML
    private JFXCheckBox urun;

    @FXML
    private JFXCheckBox potansiyelUrun;

    @FXML
    private JFXCheckBox uye;

    @FXML
    private JFXCheckBox denek;

    @FXML
    private JFXCheckBox habereKonuOlan;

    @FXML
    private JFXCheckBox hissedar;

    @FXML
    private JFXCheckBox sinav;

    @FXML
    private JFXCheckBox stajyer;

    @FXML
    private JFXCheckBox ziyaretci;

    @FXML
    private JFXCheckBox calisanAdayi;

    @FXML
    private JFXCheckBox diger;

    @FXML
    private VBox vBox;

    @FXML
    private JFXTextField gizliText;

    @FXML
    private JFXButton ekle;

    @FXML
    private JFXButton cikart;

    @FXML
    private HBox hBox;

    ArrayList<JFXTextField> gizliTextler;
    ArrayList<JFXCheckBox> checkBoxes=new ArrayList<>();
    @FXML
    void devam(ActionEvent e) {
        secimleriAl();
        if(Envanter.getInstance().getSurec().getKisiselVerisiIslenenKisi() == null ){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Uyarı"); //Alert e başlık verilmesi
            alert.setHeight(100); //Alert in genişlik ve yüksekliğinin belirlenmesi
            alert.setWidth(100);
            alert.setHeaderText("Bazı Alanlar boş bırakıldı"); //Başlık yazısının ayaralanması
            alert.setContentText("Yine de devam etmek istiyor musunuz ? "); //İçerik yazısının ayarlanaması
            ButtonType yes = new ButtonType("Evet");
            ButtonType no = new ButtonType("No");
            alert.getButtonTypes().setAll(yes,no);
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get()== no)return;
        }
        System.out.println(Envanter.getInstance().getSurec().toString());
        Switch.changeStage("Surec3",900,600,ekle);

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
        Switch.changeStage("Surec",800,600,cikart);
    }
    public void secimleriAl(){
        ArrayList<String> secimler =new ArrayList<>();
        for(JFXCheckBox x : checkBoxes){
            if(x.isSelected()) secimler.add(x.getText());
        }
        for(int i = 0 ; i< vBox.getChildren().size(); i++){
            secimler.add(((JFXTextField)vBox.getChildren().get(i)).getText());
        }
        System.out.println(secimler);
        Envanter.getInstance().getSurec().setKisiselVerisiIslenenKisi(secimler.toArray(new String[0]));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        checkBoxes.add(calisan);
        checkBoxes.add(tedarikci);
        checkBoxes.add(urun);
        checkBoxes.add(potansiyelUrun);
        checkBoxes.add(uye);
        checkBoxes.add(denek);
        checkBoxes.add(habereKonuOlan);
        checkBoxes.add(hissedar);
        checkBoxes.add(sinav);
        checkBoxes.add(stajyer);
        checkBoxes.add(ziyaretci);
        checkBoxes.add(calisanAdayi);
    }
}
