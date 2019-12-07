
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VisorAnimalesController implements Initializable 
{
    @FXML
    private ListView<Animal> listView;
    @FXML
    private ImageView imageView;
    ObservableList<Animal> animales = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        Animal perro = new Animal("Perro","appvisoranimales/thumbperro.jpg","appvisoranimales/perro.jpg");
        Animal gato = new Animal("Gato","appvisoranimales/thumbgato.jpg","appvisoranimales/gato.jpg");
        Animal pajaro = new Animal("Pajaro","appvisoranimales/thumbpajaro.jpg","appvisoranimales/pajaro.jpg");
        animales.add(gato);
        animales.add(perro);
        animales.add(pajaro);
        
        listView.setItems(animales);
        
        listView.getSelectionModel().selectedItemProperty().addListener(
         (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
            Image imagen = new Image(new_val.getImagenGrande());
            imageView.setImage(imagen);
             
                });
    } // Fin de initialize
    
} // Fin de la clase VisorAnimalesController
