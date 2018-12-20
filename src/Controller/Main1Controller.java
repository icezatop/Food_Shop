package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Main1Controller {
    @FXML
    Button addMenu,order;
// go to add new menu system
    @FXML public void gotoAddMenu(ActionEvent event){
        addMenu = (Button) event.getSource();
        Stage stage = (Stage) addMenu.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/JavaFx/AddMenu.fxml"));
        try {
            stage.setScene(new Scene(fxmlLoader.load(), 1280, 720));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // go to order system
    @FXML public void gotoOrder(ActionEvent event){
        order = (Button) event.getSource();
        Stage stage = (Stage) order.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/JavaFx/Table.fxml"));
        try {
            stage.setScene(new Scene(fxmlLoader.load(), 1280, 720));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
