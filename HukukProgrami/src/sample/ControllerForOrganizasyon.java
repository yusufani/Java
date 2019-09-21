package sample;

import Backend.Context.Envanter;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControllerForOrganizasyon implements Initializable {

    @FXML
    private JFXTextField direktorlukIsmi;

    @FXML
    private JFXTextField departmanIsmi;

    @FXML
    private  JFXTextField kisiIsmi;

    @FXML
    void devam( ) {
        Envanter.getInstance().getOrganizasyon().setBilgiGirisiYapanKisi(kisiIsmi.getText());
        Envanter.getInstance().getOrganizasyon().setDepartmanIsmi(departmanIsmi.getText());
        Envanter.getInstance().getOrganizasyon().setDirektorkukIsmı(direktorlukIsmi.getText());
        if(Envanter.getInstance().getOrganizasyon().getDirektorkukIsmı().equals("") ||
                Envanter.getInstance().getOrganizasyon().getDepartmanIsmi().equals("") ||
                Envanter.getInstance().getOrganizasyon().getBilgiGirisiYapanKisi().equals("")
    ){
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
            if(result.get()== no) return;
        }
        System.out.println(Envanter.getInstance().getOrganizasyon().toString());
        Switch.changeStage("Surec",800,600,kisiIsmi);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        direktorlukIsmi.setStyle("-fx-text-fill: white;");
        departmanIsmi.setStyle("-fx-text-fill: white;");
        kisiIsmi.setStyle("-fx-text-fill: white;");

    }
}
