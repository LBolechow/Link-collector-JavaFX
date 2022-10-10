package pl.lukaszbolechow.robot;

import pl.lukaszbolechow.robot.FindLinks;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Set;


public class AppController {
    @FXML
    private TextField textfield;
    @FXML
    private ListView listView;
    @FXML
    private Label label1;

    @FXML
    protected void onHelloButtonClick() {
        String xd = textfield.getText();
        FindLinks fd = new FindLinks();
        Set<String> lista;
        try {
            lista = fd.findLinks(xd);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ObservableList<String> names = FXCollections.observableArrayList(lista);
        listView.getItems().clear();
        listView.getItems().addAll(names);
        label1.setText("Obecnie wyszukiwane: " + xd);
    }
}