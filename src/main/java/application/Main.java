package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = FXMLLoader.load(getClass().getResource("/fxml/RootLayout.fxml"));
        primaryStage.setTitle("Workspace Configuration Tool");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();

        root.setTop(FXMLLoader.load(getClass().getResource("/fxml/MenuBar.fxml")));
    }


    public static void main(String[] args) {
        launch(args);
    }
}