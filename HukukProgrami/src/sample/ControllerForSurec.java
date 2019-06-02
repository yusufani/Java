package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
public class ControllerForSurec implements Initializable {

    @FXML
    private JFXTextField isSureci;

    @FXML
    private JFXTextField veriIslemeFaaliyetininAciklanmasi;


    @FXML
    void devam( ) {
        Envanter.getInstance().getSurec().setIsSureci(isSureci.getText());
        Envanter.getInstance().getSurec().setVeriIsletmeFaaliyetininAciklanmasi(veriIslemeFaaliyetininAciklanmasi.getText());
        if(Envanter.getInstance().getSurec().equals("") || Envanter.getInstance().getSurec().getVeriIsletmeFaaliyetininAciklanmasi().equals("")){
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
        Switch.changeStage("Surec2",900,   700,isSureci);

    }

    @FXML
    void geri() {
        Switch.changeStage("Organizasyon",800,600,isSureci);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
