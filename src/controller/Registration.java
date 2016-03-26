package controller;

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
 * Created by Amr on 3/24/2016.
 */
public class Registration implements Initializable {
@FXML
Button btnSubmit;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void regSuccesfull(ActionEvent actionEvent){

        try {
            Parent regCompletedView = FXMLLoader.load(getClass().getResource("/regCompletedView.fxml"));
            Scene regCompletedScene = new Scene(regCompletedView);
            Stage rootStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            rootStage.hide();
            rootStage.setScene(regCompletedScene);
            rootStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
