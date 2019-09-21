package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControllerForAmac implements Initializable {
    ArrayList<JFXCheckBox> checkBoxes=new ArrayList<>();
    @FXML
    private JFXCheckBox c1;

    @FXML
    private JFXCheckBox c2;

    @FXML
    private JFXCheckBox c3;

    @FXML
    private JFXCheckBox c4;

    @FXML
    private JFXCheckBox c5;

    @FXML
    private JFXCheckBox c6;

    @FXML
    private JFXCheckBox c7;

    @FXML
    private JFXCheckBox c8;

    @FXML
    private JFXCheckBox c9;

    @FXML
    private JFXCheckBox c10;

    @FXML
    private JFXCheckBox c11;

    @FXML
    private JFXCheckBox c12;

    @FXML
    private JFXCheckBox c13;

    @FXML
    private JFXCheckBox c14;

    @FXML
    private JFXCheckBox c15;

    @FXML
    private JFXCheckBox c16;

    @FXML
    private JFXCheckBox c17;

    @FXML
    private JFXCheckBox c18;

    @FXML
    private JFXCheckBox c19;

    @FXML
    private JFXCheckBox c20;

    @FXML
    private JFXCheckBox c21;

    @FXML
    private JFXCheckBox c22;

    @FXML
    private JFXCheckBox c23;

    @FXML
    private JFXCheckBox c24;

    @FXML
    private JFXCheckBox c25;

    @FXML
    private JFXCheckBox c26;

    @FXML
    private JFXCheckBox c27;

    @FXML
    private JFXCheckBox c28;

    @FXML
    private JFXCheckBox c29;

    @FXML
    private JFXCheckBox c30;

    @FXML
    private JFXCheckBox c31;

    @FXML
    private JFXCheckBox c32;

    @FXML
    private JFXCheckBox c33;

    @FXML
    private JFXCheckBox c34;

    @FXML
    private JFXCheckBox c35;

    @FXML
    private JFXCheckBox c36;

    @FXML
    private JFXCheckBox c37;

    @FXML
    private JFXCheckBox c38;

    @FXML
    private JFXCheckBox c39;

    @FXML
    private JFXCheckBox c40;

    @FXML
    private JFXCheckBox c41;

    @FXML
    private JFXCheckBox c42;

    @FXML
    private JFXCheckBox c43;

    @FXML
    private JFXCheckBox c44;

    @FXML
    private JFXCheckBox c45;

    @FXML
    private JFXCheckBox c46;

    @FXML
    private JFXCheckBox c47;

    @FXML
    private JFXCheckBox c48;

    @FXML
    private JFXCheckBox c49;

    @FXML
    private JFXCheckBox c50;

    @FXML
    private JFXCheckBox c51;

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
        if(Envanter.getInstance().getAmac().getIslemeAmaci() == null ){
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
        Switch.changeStage("Surec3",800,600,cikart);
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
        Envanter.getInstance().getAmac().setIslemeAmaci(secimler.toArray(new String[0]));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        checkBoxes.add(c1);
        checkBoxes.add(c2);
        checkBoxes.add(c3);
        checkBoxes.add(c4);
        checkBoxes.add(c5);
        checkBoxes.add(c6);
        checkBoxes.add(c7);
        checkBoxes.add(c8);
        checkBoxes.add(c9);
        checkBoxes.add(c10);
        checkBoxes.add(c11);
        checkBoxes.add(c12);
        checkBoxes.add(c13);
        checkBoxes.add(c14);
        checkBoxes.add(c15);
        checkBoxes.add(c16);
        checkBoxes.add(c17);
        checkBoxes.add(c18);
        checkBoxes.add(c19);
        checkBoxes.add(c20);
        checkBoxes.add(c21);
        checkBoxes.add(c22);
        checkBoxes.add(c23);
        checkBoxes.add(c24);
        checkBoxes.add(c25);
        checkBoxes.add(c26);
        checkBoxes.add(c27);
        checkBoxes.add(c28);
        checkBoxes.add(c29);
        checkBoxes.add(c30);
        checkBoxes.add(c31);
        checkBoxes.add(c32);
        checkBoxes.add(c33);
        checkBoxes.add(c34);
        checkBoxes.add(c35);
        checkBoxes.add(c36);
        checkBoxes.add(c37);
        checkBoxes.add(c38);
        checkBoxes.add(c39);
        checkBoxes.add(c40);
        checkBoxes.add(c41);
        checkBoxes.add(c42);
        checkBoxes.add(c43);
        checkBoxes.add(c44);
        checkBoxes.add(c45);
        checkBoxes.add(c46);
        checkBoxes.add(c47);
        checkBoxes.add(c48);
        checkBoxes.add(c49);
        checkBoxes.add(c50);
        checkBoxes.add(c51);
    }
}
