package visoranimales;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppVisorAnimales extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        StackPane rootMain = new StackPane();
        
        FXMLLoader fx = new FXMLLoader(getClass().getResource("VisorAnimales.fxml"));
        Parent root = fx.load();
        rootMain.getChildren().add(root);
        
        Scene scene = new Scene(rootMain,600,500);
        primaryStage.setTitle("Visor de Animales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}
