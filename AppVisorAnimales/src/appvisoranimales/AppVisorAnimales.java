/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class AppVisorAnimales extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        StackPane rootMain = new StackPane();
        
        FXMLLoader fx = new FXMLLoader(getClass().getResource("VisorAnimales.fxml"));
        Parent root = fx.load();
        rootMain.getChildren().add(root);
        
        Scene scene = new Scene(rootMain,600,500);
        stage.setTitle("Visor de Animales");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
