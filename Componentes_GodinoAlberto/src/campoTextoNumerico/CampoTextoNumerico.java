
package campoTextoNumerico;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CampoTextoNumerico extends TextField
{
    private String texto;
    
    public CampoTextoNumerico()
    {
        super();
        
        this.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                onActionProperty().get().handle(event);
            }
        });
    }
    
    @Override
    public void replaceText(int start, int end, String text) 
    {
        if (!text.matches("[a-z,A-Z]")) 
        {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) 
    {
        
        if (!text.matches("[a-z,A-Z]")) 
        {
            super.replaceSelection(text);
        }
    }

    public String getTexto() 
    {
        return texto;
    }

    public void setTexto(String texto) 
    {
        this.texto = texto;
        super.setText(texto);
    } 
}