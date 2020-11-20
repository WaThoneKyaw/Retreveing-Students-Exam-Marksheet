package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainFrame extends Application{
	
	public static void main(String[] args) {
		
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		/*Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("loginframe.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Welcome");
		primaryStage.show();*/
		
        AnchorPane page = (AnchorPane) FXMLLoader.load(getClass().getClassLoader().getResource("application/MainFrame.fxml"));
        
        page.setId("pane");
		Scene scene= new Scene(page,500,500);
		scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Welcome");
		primaryStage.show();
        
       //Scene scene = new Scene(page);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome");
        primaryStage.show();
	}
}
