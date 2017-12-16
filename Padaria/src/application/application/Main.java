package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(final Stage palco) throws Exception {
		Parent parent =  FXMLLoader.load(getClass().getResource("fxml/Main.fxml"));
		Scene scene = new Scene(parent);
		palco.setScene(scene);
		palco.show();

	}

	
}
