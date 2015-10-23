package cis232.converter;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KilometerConverter extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Load the fxml document
		Parent parent = FXMLLoader.load(getClass().getResource("KilometerConverter.fxml"));
		
		//Build the scene graph.
		Scene scene = new Scene(parent);
		
		//Display our window, using the scene graph
		stage.setTitle("Kilometer Converter");
		stage.setScene(scene);
		stage.show();
	}

}
