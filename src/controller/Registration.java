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
import model.AccountGenerator;
import model.User;
import model.Validation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *  Created by Amr on 3/24/2016.
 *  Controller of the Registration form view
 *
 */
public class Registration implements Initializable {


    @FXML
    Button btnSubmit;
    @FXML
    TextField tfFirstName, tfLastNAme, tfMobileNumber, tfEmail, tfPassword1, tfPassword2, tfAddress1, tfAddress2,
            tfCountry, tfNationality, tfSocailIDNumber, tfInitialDepositAmount;
    @FXML
    ComboBox<String> cbCity;
    private User newUser;
    private String errorMsg;
    private long accoutNumber;
    private ObservableList<String> cities = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            fillCities();
            cbCity.setItems(cities);
        } catch (Exception e) {

            System.out.println(e.getCause());
        }
    }

    /**
     * invoked when submit botton clicked
     *
     * @param actionEvent
     */
    @FXML
    public void registration(ActionEvent actionEvent) {

        initNewUSer();
        if (isValid(this.newUser)) {
            this.generateAcountNumber();
            addUserToDatabase();
            regSuccesfull(actionEvent);

        } else {

        }
    }

    /**
     *  Fill the observable list of cities with data
     *
    */

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

    /**
     * change scene to Regstration complete scene
     *
     * @param actionEvent
     */
    private void regSuccesfull(ActionEvent actionEvent) {

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

    /**
     * Initalize the newuser values with data passed entered by user
     */
    private void initNewUSer() {
        try {
            this.newUser = new User();
            this.newUser.setFirstName(tfFirstName.getText());
            this.newUser.setLastName(tfLastNAme.getText());
            this.newUser.setMobNumber(tfMobileNumber.getText());
            this.newUser.seteMail(tfEmail.getText());
            this.newUser.setPassword1(tfPassword1.getText());
            this.newUser.setPassword2(tfPassword2.getText());
            this.newUser.setAddress1(tfAddress1.getText());
            this.newUser.setAddress2(tfAddress2.getText());
            this.newUser.setNationality(tfNationality.getText());
            this.newUser.setCountry(tfCountry.getText());
            this.newUser.setSocialId(tfSocailIDNumber.getText());
            this.newUser.setInitialAccount(tfInitialDepositAmount.getText());


        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param user inilalzed to be checked if data is valid
     *             return the actual error in the errormsg string
     * @return true or false
     */
    private boolean isValid(User user) {
        Validation validation = new Validation(user);

        this.errorMsg = validation.getErrorMsg();
        return validation.isValid();
    }

    /**
     * generate new account number
     * access database and retrive last account number to create a new one
     *
     * @return
     */
    private long generateAcountNumber() {

        AccountGenerator accountGenerator = new AccountGenerator();


        return accountGenerator.getAccountNumber();
    }

    private void addUserToDatabase() {

    }
}
