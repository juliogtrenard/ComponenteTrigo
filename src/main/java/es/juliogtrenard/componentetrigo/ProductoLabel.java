package es.juliogtrenard.componentetrigo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Controlador del Producto Label
 */
public class ProductoLabel extends AnchorPane {
    /**
     * Imagen del producto
     */
    @FXML
    private ImageView imagenProductoImageView;

    /**
     * Nombre del producto
     */
    @FXML
    private Label nombreProductoLabel;

    /**
     * Stock del producto
     */
    @FXML
    private Label stockProductoLabel;

    /**
     * Constructor de la clase
     */
    public ProductoLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(ProductoLabel.class.getResource("/es/juliogtrenard/componentetrigo/fxml/ProductoLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Asigna la cantidad del stock
     *
     * @param cantidad del stock
     */
    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        stockProductoLabel.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    /**
     * Asigna la imagen del producto
     *
     * @param imagen Imagen del producto
     */
    public void setImage(Image imagen) {
        imagenProductoImageView.setImage(imagen);
    }

    /**
     * Asigna el nombre del producto
     *
     * @param nombre Nombre del producto
     */
    public void setNombre(String nombre) {
        nombreProductoLabel.setText(nombre);
    }

}