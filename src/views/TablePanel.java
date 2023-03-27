package views;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Employee;

public class TablePanel extends TableView<Employee> {
    TableColumn<Employee, String> name_col;

    public TablePanel() {
        this.createColumns();
        th.addColumns();
    
    }


    private void createColumns() {
        this.name_col = new TableColumn<>("Név");
        this.name_col.setCellValueFactory(new PropertyValueFactory<>("name"));
    }

    private void addColumns() {
        this.getColumns().add(name_col);
    }
}
