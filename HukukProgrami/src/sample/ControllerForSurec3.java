package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXAlert;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Stack;

import static sample.Main.stages;

public class ControllerForSurec3 implements Initializable {


    @FXML
    private JFXCheckBox yaziliForm;

    @FXML
    private VBox vboxInternet;

    @FXML
    private JFXCheckBox internetSitesiForm;

    @FXML
    private JFXCheckBox email;

    @FXML
    private JFXCheckBox elektronikVeri;

    @FXML
    private JFXCheckBox DigerElektronik;

    @FXML
    private JFXCheckBox telefon;

    @FXML
    private JFXCheckBox sozlu;

    @FXML
    private JFXCheckBox ucuncEmail;

    @FXML
    private JFXCheckBox ucuncuInternet;

    @FXML
    private JFXCheckBox ucuncuTelefon;

    @FXML
    private JFXCheckBox ucuncuSozlu;

    @FXML
    private VBox vboxUcuncu;

    @FXML
    private JFXCheckBox ucuncuElektronik;

    @FXML
    private JFXCheckBox ucuncuAleni;

    @FXML
    private HBox hBox;

    @FXML
    private JFXCheckBox diger;

    @FXML
    private JFXButton cikart;

    @FXML
    private JFXButton ekle;

    @FXML
    private VBox vboxElektronik;

    @FXML
    private VBox vBox;

    ArrayList<JFXTextField> gizliTextler;
    ArrayList<JFXCheckBox> buttons  = new  ArrayList<>();
    ArrayList<VBox> vboxes= new  ArrayList<>();
    @FXML
    void devam(ActionEvent e) {
        secimleriAl();
        if(Envanter.getInstance().getSurec().getKisiselVerininToplanmaYontemi() == null ){
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
        System.out.println("Problem yok ");
        Switch.changeStage("VerilerinIslenmesi",900,600,ekle);
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
        Switch.changeStage("Surec2",800,600,cikart);
    }

    public void secimleriAl(){
        ArrayList<String> secimler =new ArrayList<>();
        for(JFXCheckBox x : buttons){
            if(x.isSelected()) secimler.add(x.getText());
        }
        for(int i = 0 ; i< vBox.getChildren().size(); i++){
            secimler.add(((JFXTextField)vBox.getChildren().get(i)).getText());
        }
        for (VBox x : vboxes){
            if(((JFXCheckBox) x.getChildren().get(0)).isSelected()){
                secimler.add(((JFXButton)x.getChildren().get(0)).getText()+((JFXTextField)x.getChildren().get(1)).getText());

            }
        }
        Envanter.getInstance().getSurec().setKisiselVerininToplanmaYontemi(secimler.toArray(new String[0]));
        System.out.println(secimler);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttons.add(email);
        buttons.add(elektronikVeri);
        buttons.add(DigerElektronik);
        buttons.add(telefon);
        buttons.add(sozlu);
        buttons.add(ucuncEmail);
        buttons.add(ucuncuInternet);
        buttons.add(ucuncuTelefon);
        buttons.add(ucuncuSozlu);
        buttons.add(ucuncuAleni);
        buttons.add(yaziliForm);
        vboxes.add(vboxInternet);
        vboxes.add(vboxElektronik);
        vboxes.add(vboxUcuncu);
    }
    @FXML
    void metinOlustur(ActionEvent event) {
        createATextField(internetSitesiForm,vboxInternet);

    }

    private void createATextField(JFXCheckBox jfxCheckBox, VBox vbox) {
        if(jfxCheckBox.isSelected()){
            JFXTextField jfxTextField = new JFXTextField();
            jfxTextField.setVisible(true);
            vbox.getChildren().add(jfxTextField);
        }
        else{
            vbox.getChildren().remove(1);
        }
    }

    @FXML
    void metinOlustur2(ActionEvent event) {
        createATextField(DigerElektronik,vboxElektronik);
    }

    @FXML
    void metinOlustur3(ActionEvent event) {
            createATextField(ucuncuElektronik,vboxUcuncu);
    }
}
