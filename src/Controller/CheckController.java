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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


public class CheckController {
    @FXML
    Button home,dis10,dis15,dis20,check;
    @FXML
    Label totalPrice;
    @FXML
    TableView listCheck;
    @FXML
    TableColumn<Schedule2,String>name,price;
    ObservableList<Schedule2> Data= FXCollections.observableArrayList();
    ArrayList<Schedule2> kawin = Start();
    double total=0;
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
    public ArrayList<Schedule2> Start(){
        ArrayList<Schedule2> arrayList = new ArrayList<>();
        String driver = "org.sqlite.JDBC";
        String urlDB = "jdbc:sqlite:FoodShop.db";
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(urlDB);
            Statement statement = connection.createStatement();
            String sql = "Select * From table1";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                arrayList.add(new Schedule2(resultSet.getString("name"),resultSet.getString("price")));

            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public void addfunc(){
        Data.clear();
        for(Schedule2 x : kawin)
            Data.add(new Schedule2(x.getName(),x.getPrice()));
        setTotal();
    }

    public void setTotal(){

        for(Schedule2 i : kawin)
            total+= Integer.parseInt(i.getPrice());
        totalPrice.setText(String.valueOf(total));
    }

    public void initialize() {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        listCheck.setItems(Data);
        addfunc();

    }
    public void setDis10(){
        total=0;
        for(Schedule2 i : kawin)
            total+= Integer.parseInt(i.getPrice());
        totalPrice.setText(String.valueOf(total*0.9));
    }
    public void setDis15(){
        total=0;
        for(Schedule2 i : kawin)
            total+= Integer.parseInt(i.getPrice());
        totalPrice.setText(String.valueOf(total*0.85));
    }
    public void setDis20(){
        total=0;
        for(Schedule2 i : kawin)
            total+= Integer.parseInt(i.getPrice());
        totalPrice.setText(String.valueOf(total*0.80));
    }

    public void setCheck(){
        database.remove();
        totalPrice.setText("0");
        Data.clear();
    }
}




