package pocketpokemon;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectUserController implements Initializable {

    public void changeScreenLoginCoach(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("start/coach/LogInCoach.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void changeScreenLoginInvestigator(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("start/investigator/LogInInvestigator.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void changeScreenSignIn(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("LogInCoach.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
