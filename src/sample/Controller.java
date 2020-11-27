package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.SQLOutput;

//import javax.swing.text.html.ListView;
//import java.awt.*;

public class Controller {

    @FXML
    private TextField inputZone;

    @FXML
//    private ListView<String> listView;
    private ListView<String> listView;

    private final ObservableList<String> messages = FXCollections.observableArrayList
            ("Тимофей", "Домашка", "Надо проверить");

    @FXML
    public void initialize() {
        listView.setItems(messages);
    }

    @FXML
    public void addStringToMessageList() {
        String message = inputZone.getText();
        if (message.isEmpty()) {
            System.out.println("Вы на что намекаете? Отправить пустое сообщение?\nСоскучились по капче?!");
        } else {
            listView.getItems().add(message);
        }
        inputZone.clear();
    }

    @FXML
    public void exit() {
        System.exit(1);
    }
}
