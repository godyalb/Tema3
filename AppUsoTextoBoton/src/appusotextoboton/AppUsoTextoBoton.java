package appusotextoboton;

import customcontrolexample.CustomControl;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppUsoTextoBoton extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        //Crea los componentes de la ventana
        CustomControl c1 = new CustomControl();
        CustomControl c2 = new CustomControl();
        BorderPane root = new BorderPane();
        VBox vb = new VBox();
        
        c1.setText("Nombre");
        c2.setText("Apellido");
        
        //Añade los componentes a la ventana
        vb.getChildren().addAll(c1,c2);
        root.setCenter(vb);
        
        Label mensaje = new Label();
        mensaje.setText("Pulsa algun boton. Respuesta en consola");
        mensaje.setAlignment(Pos.CENTER);
        root.setBottom(mensaje);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("AppUsoTextoBoton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
