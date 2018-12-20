package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;


public class CheckController {
    @FXML
    Button home,dis10,dis15,dis20,check;
    @FXML
    Label totalPrice;
    @FXML
    TableView listCheck;
    @FXML
    TableColumn<Schedule,String>name,price;


    @FXML public void toMainPageBtn(ActionEvent event){
        home = (Button) event.getSource();
        Stage stage = (Stage) home.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/JavaFx/Main1.fxml"));
        try {
            stage.setScene(new Scene(fxmlLoader.load(), 1280, 720));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBtn(){
        if(!menu.getSelectionModel().isEmpty())
            Data2.add(menu.getSelectionModel().getSelectedItem());
    }

}
