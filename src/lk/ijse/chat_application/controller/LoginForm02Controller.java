package lk.ijse.chat_application.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginForm02Controller {
    public AnchorPane loginContext;
    public JFXTextField txtName;
    public static String name;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        name = txtName.getText();
        loginContext.getChildren().clear();
        Stage stage = (Stage) loginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/chat_application/view/client-02-form.fxml"))));
    }
}
