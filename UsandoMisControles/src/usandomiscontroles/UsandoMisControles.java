/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import t3actividad3.MiControl;


/**
 *
 * @author Alberto Godino Berrocal - 2º DAM
 */
public class UsandoMisControles extends Application {
    
    private int contador = 1;
    @Override
    public void start(Stage primaryStage) {
        
//        StackPane spane = new StackPane();        
        BorderPane bpane = new BorderPane();
        Label etiqueta = new Label();
        
        MiControl mcontrol = new MiControl();
        mcontrol.setMaxHeight(100);
        mcontrol.setMaxWidth(100);
        mcontrol.setOnAction(e->{
            
            if(contador == 1){
                etiqueta.setText("Estoy pulsando el area de mi control");
                contador += 1;
            }
            else{
                etiqueta.setText("Vuelvo a pulsar mi control");
            }
            System.out.println("Estoy pulsando el area de mi control");
            
        });
        bpane.setBottom(etiqueta);
        bpane.setCenter(mcontrol);
        
        
        
        
        Scene scene = new Scene(bpane, 400, 400);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Usando Mi Control");
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
