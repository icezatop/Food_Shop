package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class AddMenuController extends OrderController{
    @FXML
    Button add, back, delete,show;
    @FXML
    TextField name, price, type;
    @FXML
    TableView<Schedule> menu;
    @FXML
    TableColumn<Schedule, String> nameMenu, priceMenu, typeMenu;
    @FXML
    ChoiceBox<String> menuChoiceBox;

    // back button
    @FXML
    public void backBtn(ActionEvent event) {
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
    @FXML
    public void addCourseBtn() {
        database.addCourse(name.getText(), price.getText(), type.getText());
        name.clear();
        price.clear();
        type.clear();
    }



    @Override
    public void Start() {
        super.Start();
    }
    public void initialize() {
        nameMenu.setCellValueFactory(new PropertyValueFactory<Schedule, String>("name"));
        priceMenu.setCellValueFactory(new PropertyValueFactory<Schedule, String>("price"));
        typeMenu.setCellValueFactory(new PropertyValueFactory<Schedule, String>("type"));
        menuChoiceBox.getItems().add("All");
        menuChoiceBox.getItems().add("ทอด");
        menuChoiceBox.getItems().add("ต้ม");
        menuChoiceBox.getItems().add("ผัด");
        menuChoiceBox.getItems().add("ยำ");

        menuChoiceBox.setValue("All");
        menu.setItems(Data);
        Start();
    }
    @Override
    public void ShowBth() {
        super.ShowBth();
    }

}