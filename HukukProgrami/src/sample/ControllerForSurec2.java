package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Stack;

import static sample.Main.stages;

public class ControllerForSurec2 {

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
        String [] secimler =new String[10];
        int index =0;
        if(calisan.isSelected()){
            secimler[index++]="Calışan";
        }
        if(tedarikci.isSelected()){
            secimler[index++]="Tedarikçi";
        }
        if(urun.isSelected()){
            secimler[index++]="Ürün veya Hizmet Alan Kişi (Müşteri)";
        }
        if(potansiyelUrun.isSelected()){
            secimler[index++]="Potansiyel Ürün veya Hizmet Alıcısı (Potansiyel Müşteri) ";
        }
        if(uye.isSelected()){
            secimler[index++]="Üye";
        }
        if(denek.isSelected()){
            secimler[index++]="Denek";
        }
        if(habereKonuOlan.isSelected()){
            secimler[index++]="Habere konu kişi";
        }
        if(hissedar.isSelected()){
            secimler[index++]="Hissedar/Ortak";
        }
        if(sinav.isSelected()){
            secimler[index++]="Sınav adayı";
        }
        if(stajyer.isSelected()){
            secimler[index++]="Stajyer";
        }
        if(ziyaretci.isSelected()){
            secimler[index++]="Ziyaretçi";
        }
        if(calisanAdayi.isSelected()){
            secimler[index++]="Çalışan Adayı";
        }
        for(int i = 0 ; i< vBox.getChildren().size(); i++){
            secimler[index++]=vBox.getChildren().get(i).getAccessibleText();
        }
        System.out.println(secimler);
        Envanter.getInstance().getIslenenVeriler().setIslenenKisiselVeriKategorisi(secimler);
    }

}
