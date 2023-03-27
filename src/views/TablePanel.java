package views;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Employee;

public class TablePanel extends TableView<Employee> {
    TableColumn<Employee, String> name_col;
    TableColumn<Employee, String> city_col;
    TableColumn<Employee, String> salary_col;

    public TablePanel() {
        this.createColumns();
        this.addColumns();

    }

    private void createColumns() {
        this.name_col = new TableColumn<>("Név");
        this.name_col.setCellValueFactory(new PropertyValueFactory<>("name"));

        this.city_col = new TableColumn<>("Település");
        this.city_col.setCellValueFactory(new PropertyValueFactory<>("city"));

        this.salary_col = new TableColumn<>("Fizetés");
        this.salary_col.setCellValueFactory(new PropertyValueFactory<>("salary"));
    }

    private void addColumns() {
        this.getColumns().add(name_col);
        this.getColumns().add(city_col);
        this.getColumns().add(salary_col);
    }
}
