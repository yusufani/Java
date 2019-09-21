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

public class ControllerForVerilerinIslenmesi implements Initializable {
    HashMap<TitledPane,String> titlePanes=new HashMap<>();
    @FXML
    private TitledPane kimlik;

    @FXML
    private TitledPane iletisim;

    @FXML
    private TitledPane lokasyon;

    @FXML
    private TitledPane ozluk;

    @FXML
    private TitledPane hukukIIslem;

    @FXML
    private TitledPane muşteriIslem;

    @FXML
    private JFXCheckBox c1521;

    @FXML
    private TitledPane fizikselMekanGüvenliği;

    @FXML
    private TitledPane islemGuvenligi;

    @FXML
    private TitledPane riskYönetimi;

    @FXML
    private TitledPane finans;

    @FXML
    private TitledPane meslekiDeneyim;

    @FXML
    private TitledPane pazarlama;

    @FXML
    private TitledPane görselVeIsitselKayitlar;

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
        Switch.changeStage("OzelVerilerinIslenmesi",900,600,ekle);
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
        HashMap<String ,String> secimler =new HashMap<>();
        for(TitledPane x : titlePanes.keySet()){
            for( Node y : (((VBox) x.getContent()).getChildren())){
                if(((JFXCheckBox) y).isSelected()){
                    secimler.put(((JFXCheckBox) y).getText(),x.getText());
                }
            }
        }
        for(int i = 0 ; i< vBox.getChildren().size(); i++){
            secimler.put(((JFXTextField)vBox.getChildren().get(i)).getText(),"Diğer");
        }
        System.out.println(secimler);
        Envanter.getInstance().getIslenenVeriler().setIslenenVeriler(secimler);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) { titlePanes.put(kimlik,kimlik.getText());
       titlePanes.put(iletisim,iletisim.getText());
       titlePanes.put(lokasyon,lokasyon.getText());
       titlePanes.put(ozluk,ozluk.getText());
       titlePanes.put(hukukIIslem,hukukIIslem.getText());
       titlePanes.put(muşteriIslem,muşteriIslem.getText());
       titlePanes.put(fizikselMekanGüvenliği,fizikselMekanGüvenliği.getText());
       titlePanes.put(islemGuvenligi,islemGuvenligi.getText());
       titlePanes.put(riskYönetimi,riskYönetimi.getText());
       titlePanes.put(finans,finans.getText());
       titlePanes.put(meslekiDeneyim,meslekiDeneyim.getText());
       titlePanes.put(pazarlama,pazarlama.getText());
       titlePanes.put(görselVeIsitselKayitlar,görselVeIsitselKayitlar.getText());
    }
}
