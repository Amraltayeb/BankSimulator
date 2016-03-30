package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
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
    @FXML
    TextField tfFirstName, tfLastNAme, tfMobileNumber, tfEmail, tfPassword1, tfPassword2, tfAddress1, tfAddress2,
            tfCountry, tfNationality, tfSocailIDNumber, tfInitialDepositAmount;
    @FXML
    ComboBox<String> cbCity;
    private ObservableList<String> cities = FXCollections.observableArrayList();

    public Registration() {


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            fillCities();
            cbCity.setItems(cities);
        } catch (Exception e) {

            System.out.println(e.getCause());
        }


    }

    private void fillCities() {

        cities.add("Cairo");
        cities.add("Alexandria");
        cities.add("Elminia");
        cities.add("Monofiya");
        cities.add("Giza");
        cities.add("Asyout");
        cities.add("Aswan");
        cities.add("Sohag");

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
