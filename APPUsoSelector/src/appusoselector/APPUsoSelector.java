/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import SelectorDeslizamiento.SelectorDeslizamiento;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author GODINOFERRO
 */
public class APPUsoSelector extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane rootMain = new StackPane();
        
        FXMLLoader fxload = new FXMLLoader(getClass().getResource("APPUsoSelector.fxml"));
        Parent root = fxload.load();
        
        rootMain.getChildren().add(root);
        
        Scene scene = new Scene(rootMain, 300, 250);
        
        primaryStage.setTitle("APPUsoSelector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
