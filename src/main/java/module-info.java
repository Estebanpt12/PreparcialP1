module co.edu.uniquindio.preparcialp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    exports co.edu.uniquindio.preparcialp1.application;
    opens co.edu.uniquindio.preparcialp1.application to javafx.fxml;
    exports co.edu.uniquindio.preparcialp1.controllers;
    opens co.edu.uniquindio.preparcialp1.controllers to javafx.fxml;
}