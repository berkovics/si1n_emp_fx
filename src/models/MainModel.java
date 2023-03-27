package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainModel {

    public MainModel() {
    }

    public ObservableList<Employee> getEmployee() {
        ObservableList<Employee> employeeList = FXCollections.observableArrayList(
                new Employee("Erős István", "Szeged", 387),
                new Employee("Parlang Katalin", "Szeged", 382),
                new Employee("Kukor Ica", "Szolnok", 381),
                new Employee("Velős Bálint", "Miskolc", 371),
                new Employee("Termés Aladár", "Miskolc", 379));
        return employeeList;
    }
}
