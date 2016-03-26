package controller;

import com.sun.org.apache.xml.internal.security.Init;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Amr on 3/26/2016.
 */
public class RegCompleteController implements Initializable {
    @FXML
    Button btnBackToLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void backToLogin(ActionEvent actionEvent){

        try {
            Parent loginView = FXMLLoader.load(getClass().getResource("/mainView.fxml"));
            Scene loginScene = new Scene(loginView, 320, 450);
            Stage rootStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            rootStage.hide();
            rootStage.setScene(loginScene);
            rootStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}
