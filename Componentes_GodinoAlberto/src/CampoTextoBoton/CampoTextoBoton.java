/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoBoton;

import customcontrolexample.CustomControl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class CampoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FXMLCampoTextoBotonController campoTextoBoton = new FXMLCampoTextoBotonController();
        campoTextoBoton.setText("Hello! Ejercicio Campo Texto Boton");
        
        primaryStage.setScene(new Scene(campoTextoBoton));
        primaryStage.setTitle("Campo Texto Boton");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
