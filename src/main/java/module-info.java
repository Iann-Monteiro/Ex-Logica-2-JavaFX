module org.iannmonteiro.projetojavafxjdbc {
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


    opens org.iannmonteiro.projetojavafxjdbc.entities to javafx.graphics, javafx.fxml, javafx.base;
    opens org.iannmonteiro.projetojavafxjdbc.services to javafx.graphics, javafx.fxml;
    opens org.iannmonteiro.projetojavafxjdbc to javafx.fxml;
    exports org.iannmonteiro.projetojavafxjdbc;
}