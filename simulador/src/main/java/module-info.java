module com.example.simulador {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires java.net.http;

    opens com.example.simulador to javafx.fxml;
    exports com.example.simulador;
    exports com.example.simulador.individuos;
    opens com.example.simulador.individuos to javafx.fxml;
    exports com.example.simulador.individuos.identificacion;
    opens com.example.simulador.individuos.identificacion to javafx.fxml;
}