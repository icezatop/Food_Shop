package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMenuController {
    @FXML
    Button add , back;
    @FXML
    TextField name,price,type;
// back button
    @FXML public void backBtn(ActionEvent event){
        back = (Button) event.getSource();
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/JavaFx/Main1.fxml"));
        try {
            stage.setScene(new Scene(fxmlLoader.load(), 1280, 720));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// add new Menu
    @FXML public void addCourseBtn(){
        database.addCourse(name.getText(),price.getText(),type.getText());
        name.clear();
        price.clear();
        type.clear();
    }


}
