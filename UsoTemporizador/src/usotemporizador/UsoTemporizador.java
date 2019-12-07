package usotemporizador;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import temporizador.Temporizador;

public class UsoTemporizador extends Application
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        Temporizador c = new Temporizador();
        c.setAlignment(Pos.CENTER);
        
        VBox root = new VBox(); //Distribución vertical
        root.setPrefSize(400, 300);
        root.setAlignment(Pos.CENTER);
        
        VBox v = new VBox();
        v.getChildren().add(c);
        
        root.getChildren().add(v);
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.show();
        
        c.getNumero().textProperty().addListener(new ChangeListener<String>()
        {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                if(newValue.equals("0"))
                {
                    
                }
            }
        });
    } 
}
