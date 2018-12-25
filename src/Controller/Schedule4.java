package Controller;

import javafx.beans.property.SimpleStringProperty;

public class Schedule4 {
    private final SimpleStringProperty name;
    private final SimpleStringProperty price;


    public Schedule4(String name, String price) {
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleStringProperty(price);


    }

    public String getName() {
        return name.get();
    }

    public String getPrice() {
        return price.get();
    }

}

