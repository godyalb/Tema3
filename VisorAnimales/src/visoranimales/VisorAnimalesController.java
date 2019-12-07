package visoranimales;

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
        Animal perro = new Animal("Perro","visoranimales/thumbperro.jpg","visoranimales/perro.jpg");
        Animal gato = new Animal("Gato","visoranimales/thumbgato.jpg","visoranimales/gato.jpg");
        Animal pajaro = new Animal("Pajaro","visoranimales/thumbpajaro.jpg","visoranimales/pajaro.jpg");
        animales.add(gato);
        animales.add(perro);
        animales.add(pajaro);
        
        listView.setItems(animales);
        
        listView.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        listView.getSelectionModel().selectedItemProperty().addListener(
         (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
            Image imagen = new Image(new_val.getImagenGrande());
            imageView.setImage(imagen);
             
                });
    } 
}
