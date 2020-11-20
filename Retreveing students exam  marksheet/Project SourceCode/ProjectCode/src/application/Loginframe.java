package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Loginframe extends Application{
	
	public static void main(String[] args) {
		
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		/*Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("loginframe.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Welcome");
		primaryStage.show();*/
		
		System.out.println(" before ........!");
        AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/MainFrame.fxml"));
        System.out.println(" after .............!");
        Scene scene = new Scene(page);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome");
        primaryStage.show();
	}
}