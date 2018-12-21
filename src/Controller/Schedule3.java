package Controller;

import javafx.beans.property.SimpleStringProperty;

public class Schedule3 {
    private final SimpleStringProperty name;
    private final SimpleStringProperty table;


    public Schedule3(String name,String table) {
        this.name = new SimpleStringProperty(name);
        this.table = new SimpleStringProperty(table);

    }

    public String getTable() {
        return table.get();
    }

    public String getName() {
        return name.get();
    }

}
