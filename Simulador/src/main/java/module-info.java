module es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador to javafx.fxml;
    exports es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador;
}