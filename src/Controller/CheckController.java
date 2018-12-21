package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.sql.*;


public class CheckController {
    @FXML
    Button home,dis10,dis15,dis20,check;
    @FXML
    Label totalPrice;
    @FXML
    TableView listCheck;
    @FXML
    TableColumn<Schedule,String>name,price;

// back to home scaen
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

    public void setTotalPrice(){

    }
    ObservableList<Schedule2> Data= FXCollections.observableArrayList();
    public void Start(){
        String driver = "org.sqlite.JDBC";
        String urlDB = "jdbc:sqlite:FoodShop.db";
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(urlDB);
            Statement statement = connection.createStatement();
            String sql = "Select * From list";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Data.add(new Schedule2(resultSet.getString("name"),resultSet.getString("price")));

            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
