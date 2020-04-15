package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFXWelcome");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(sceneTitle,0,0,2,1);

        Label labelUserName = new Label("Username:");
        gridPane.add(labelUserName,0, 1);

        TextField textFieldUserName = new TextField();
        gridPane.add(textFieldUserName, 1,1);

        Label labelPassword = new Label("Password:");
        gridPane.add(labelPassword,0, 2);

        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1,2);

        Scene scene = new Scene(gridPane, 400, 275);
        primaryStage.setScene(scene);

        Button button = new Button("Sign in");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button);
        gridPane.add(hBox, 1,4);

        final Text actionTarget = new Text();
        gridPane.add(actionTarget, 1, 6);

        button.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                   actionTarget.setFill(Color.FIREBRICK);
                   actionTarget.setText("Sign in button pressed");
               }
        });

        // gridPane.setGridLinesVisible(true);
        primaryStage.show();
    }
}