module es.juliogtrenard.componentetrigo {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.componentetrigo to javafx.fxml;
    exports es.juliogtrenard.componentetrigo;
}