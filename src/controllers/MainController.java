package controllers;

import javafx.collections.ObservableList;
import models.Employee;
import models.MainModel;
import views.MainView;

public class MainController {
    MainView mainView;
    MainModel mainModel;

    public MainController() {
        this.mainView = new MainView();
        this.mainModel = new MainModel();
        ObservableList<Employee> empList = this.mainModel.getEmployee();
        this.mainView.getTablePanel().setItems(empList);
    }

    public MainView getMainView() {
        return mainView;
    }

}
