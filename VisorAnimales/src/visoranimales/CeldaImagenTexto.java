package visoranimales;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CeldaImagenTexto extends ListCell<Animal>
{
    VBox vb = new VBox();
    ImageView image = new ImageView();
    Label nombre = new Label();
    
    public CeldaImagenTexto()
    {
        image.setPreserveRatio(true);
        image.setFitHeight(100);
        vb.getChildren().addAll(image,nombre);
    }
    
    @Override
    public void updateItem(Animal animal,boolean empty)
    {
        super.updateItem(animal, empty);
        if(animal == null)
        {
            setGraphic(null);
        }
        else
        {
            Image imagen = new Image(animal.getImagenMiniatura());
            image.setImage(imagen);
            nombre.setText(animal.getNombre());
            setGraphic(vb);
        }
    }
}
