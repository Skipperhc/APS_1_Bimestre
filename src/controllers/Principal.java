package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class Principal extends Application {

	private static Stage primaryStage;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			TitledPane root = FXMLLoader.load(getClass().getResource("../views/TelaPrincipal.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			setPrimaryStage(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void setPrimaryStage(Stage primaryStage) {
		Principal.primaryStage = primaryStage;
	}
}
