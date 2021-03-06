import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;


public class Main extends Application {
    Parent root;
    Parent regRoot;
    Scene scene1;
    Scene regScene;

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("CIB Bank");
        initMainLayout();

    }

    public void initMainLayout() {

        try {
            root = FXMLLoader.load(getClass().getResource("mainView.fxml"));
            scene1 = new Scene(root, 320, 450);
            this.primaryStage.setScene(scene1);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    public void goToRegistration(ActionEvent actionEvent){
//        try {
//            regRoot  = FXMLLoader.load(getClass().getResource("view/regview.fxml"));
//            regScene = new Scene(regRoot , 600 , 600) ;
//            this.primaryStage.setScene(regScene);
//            this.primaryStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
