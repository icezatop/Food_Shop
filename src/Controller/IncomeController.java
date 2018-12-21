package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class IncomeController {
    @FXML
    TableView incomeTable;
    @FXML
    TableColumn<Schedule2,String>id,name,price;
    @FXML
    Button show;
    @FXML
    Label text;


}
