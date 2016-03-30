package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


/**
 * Created by Amr on 3/24/2016.
 */
public class mainController implements Initializable {

    @FXML
    Button btnSignup;
    @FXML
    Label lblWrongpasword;
    //#a40202 red
    //#03A9F4 blue
    @FXML
    TextField lblAccount;
    @FXML
    TextField lblPassword;

    @FXML
    public void login(ActionEvent actionEvent) {
        try {
            Parent home_page_layout = FXMLLoader.load(getClass().getResource("/homePageView.fxml"));
            Scene home_page_scene = new Scene(home_page_layout);
            Stage rootStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            if(isValid()){
                rootStage.hide();
                rootStage.setScene(home_page_scene);
                rootStage.show();
            }else{
                lblAccount.setText("");
                lblPassword.setText("");
                lblWrongpasword.setText("Account number or password is wrong , please try again");
            }


        } catch (Exception e) {
            System.out.println("login error");
        }
    }

    @FXML
    public void goToRegistration(ActionEvent actionEvent) {
        try {
            Parent reg_view = FXMLLoader.load(getClass().getResource("/regview.fxml"));
            Scene reg_scene = new Scene(reg_view);
            Stage rootStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            rootStage.hide();
            rootStage.setScene(reg_scene);
            rootStage.show();

        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }


    //  private boolean isValid(){
//      boolean valid = false;
//
//      Connection c = null;
//      Statement stmnt = null;
//      String db = "jdbc:sqlite:appDB.db";
//      try {
//        c = DriverManager.getConnection(db);
//          c.setAutoCommit(false);
//          System.out.println("Db Connected successfully");
//          stmnt = c.createStatement();
//
//          ResultSet rs = stmnt.executeQuery("SELECT * FROM logintable WHERE accountnumber = " + "'" + lblAccount.getText()
//                  + "'" + "AND password = " + "'" + lblPassword.getText() + "'");
//
//          while (rs.next() ){
//              if (rs.getString("accountnumber") != null && rs.getString("password") != null){
//                  String accountnumber  = rs.getString("accountnumber");
//                  System.out.println(accountnumber);
//                  String password  = rs.getString("accountnumber");
//                  System.out.println(password);
//                  valid = true;
//              }
//
//          }
//          rs.close();
//          stmnt.close();
//          c.close();
//      }catch (Exception e){
//        System.err.println(e.getClass().getName() + ":" + e.getMessage());
//          System.exit(0);
//
//      }
//      System.out.println(" user and password correct");
//      return valid;
//  }
    private boolean isValid() {   //mysql
        boolean valid = false;

        Connection c = null;
        Statement stmnt = null;

        String db = "jdbc:mysql://db4free.net:3306/amrdb";
        String dbusername = "amrdb";
        String dbpassword = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            c = DriverManager.getConnection(db, dbusername, dbpassword);

            c.setAutoCommit(false);
            System.out.println("Db Connected successfully");
            stmnt = c.createStatement();

            ResultSet rs = stmnt.executeQuery("SELECT * FROM logintable WHERE accountnumber = " + "'" + lblAccount.getText()
                    + "'" + "AND password = " + "'" + lblPassword.getText() + "'");

            while (rs.next()) {
                if (rs.getString("accountnumber") != null && rs.getString("password") != null) {
                    String accountnumber = rs.getString("accountnumber");
                    System.out.println(accountnumber);
                    String password = rs.getString("accountnumber");
                    System.out.println(password);
                    valid = true;
                }

            }
            rs.close();
            stmnt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);

        }
        System.out.println(" user and password correct");
        return valid;
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
