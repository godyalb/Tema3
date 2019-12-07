/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import SelectorDeslizamiento.SelectorDeslizamiento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author GODINOFERRO
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento arriba;
    @FXML
    private SelectorDeslizamiento abajo;
    @FXML
    private Label texto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        arriba.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("Pulsado el selector de arriba.");
            }
        });
        
        abajo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("Pulsado el selector de abajo.");
            }
        });
    }    
    
}
