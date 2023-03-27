package views;

import javafx.scene.layout.VBox;

public class MainView extends VBox {
    TablePanel tablePanel;

    public MainView() {
        this.tablePanel = new TablePanel();
        this.getChildren().add(this.tablePanel);
    }

}
