package temporizador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class Temporizador extends javafx.scene.layout.HBox implements Initializable
{
    @FXML private Label Numero;
    private Timeline tiempo;
    private Integer inicio = 5;
    private IntegerProperty segundos = new SimpleIntegerProperty(inicio);
    @FXML private HBox panel;
    @FXML private Label label1;
    @FXML private Label label2;
    
    public Temporizador()
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("temporizador.fxml"));
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
        }
        catch(IOException ex)
        {
            System.out.println("Error cargando el componente.");
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        Numero.textProperty().bind(segundos.asString());
        segundos.set(inicio);
        tiempo = new Timeline();
        tiempo.getKeyFrames().add(new KeyFrame(Duration.seconds(inicio + 1), new KeyValue(segundos,0)));
        tiempo.playFromStart();
    }

    public Label getNumero() 
    {
        return Numero;
    }

    public void setNumero(Label Numero) 
    {
        this.Numero = Numero;
    }

    public Timeline getTiempo() 
    {
        return tiempo;
    }

    public void setTiempo(Timeline tiempo) 
    {
        this.tiempo = tiempo;
    }

    public Integer getInicio() 
    {
        return inicio;
    }

    public void setInicio(Integer inicio) 
    {
        this.inicio = inicio;
    }

    public IntegerProperty getSegundos() 
    {
        return segundos;
    }

    public void setSegundos(IntegerProperty segundos) 
    {
        this.segundos = segundos;
    }

    public HBox getPanel() 
    {
        return panel;
    }

    public void setPanel(HBox panel) 
    {
        this.panel = panel;
    }

    public Label getLabel1() 
    {
        return label1;
    }

    public void setLabel1(Label label1) 
    {
        this.label1 = label1;
    }

    public Label getLabel2() 
    {
        return label2;
    }

    public void setLabel2(Label label2) 
    {
        this.label2 = label2;
    }
}
