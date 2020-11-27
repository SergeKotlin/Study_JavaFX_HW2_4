package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public final String PATH_TO_FXML = "sample.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(PATH_TO_FXML));
        primaryStage.setTitle("Lesson 4");
//        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

/** ✓1. Создать окно для клиентской части чата:
 *      ✓1.1 большое текстовое поле для отображения переписки в центре окна.
 *      ✓1.2 Однострочное текстовое поле для ввода сообщений
 *      ✓1.3 и кнопка для отсылки сообщений на нижней панели.
 *      ✓1.4 Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
 *      ✓1.5 При «отсылке» сообщение перекидывается из нижнего поля в центральное.
 *      + не добавляет пустые сообщения
 * **/
//Serega, sure