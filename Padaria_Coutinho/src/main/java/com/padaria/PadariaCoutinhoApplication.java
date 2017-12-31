package com.padaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@SuppressWarnings("restriction")
@Component
public class PadariaCoutinhoApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage.setTitle("Padaria Coutinho");
		stage.setScene(new Scene(root, 700.0, 500.0));
		stage.show();
	}

}
