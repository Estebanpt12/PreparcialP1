package co.edu.uniquindio.preparcialp1.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PrincipalViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BotonAgregar;

    @FXML
    private Button BotonBuscar;

    @FXML
    private TextField CodgioEdtudianteBuscar;

    @FXML
    private TableColumn<?, ?> ColuimnaCodigo;

    @FXML
    private TableColumn<?, ?> ColumnaNombre;

    @FXML
    private TableColumn<?, ?> ColumnaNota1;

    @FXML
    private TableColumn<?, ?> ColumnaNota2;

    @FXML
    private TableColumn<?, ?> ColumnaNota3;

    @FXML
    private TableView<?> TablaEstudiante;

    @FXML
    private TextField TextCodigo;

    @FXML
    private TextField TextNombre;

    @FXML
    private TextField TextNota1;

    @FXML
    private TextField TextNota2;

    @FXML
    private TextField TextNota3;

    @FXML
    void eventButtonAgregar(ActionEvent event) {
        
    }

    @FXML
    void eventButtonBuscar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BotonAgregar != null : "fx:id=\"BotonAgregar\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert BotonBuscar != null : "fx:id=\"BotonBuscar\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert CodgioEdtudianteBuscar != null : "fx:id=\"CodgioEdtudianteBuscar\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert ColuimnaCodigo != null : "fx:id=\"ColuimnaCodigo\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert ColumnaNombre != null : "fx:id=\"ColumnaNombre\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert ColumnaNota1 != null : "fx:id=\"ColumnaNota1\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert ColumnaNota2 != null : "fx:id=\"ColumnaNota2\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert ColumnaNota3 != null : "fx:id=\"ColumnaNota3\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TablaEstudiante != null : "fx:id=\"TablaEstudiante\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TextCodigo != null : "fx:id=\"TextCodigo\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TextNombre != null : "fx:id=\"TextNombre\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TextNota1 != null : "fx:id=\"TextNota1\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TextNota2 != null : "fx:id=\"TextNota2\" was not injected: check your FXML file 'principal_view.fxml'.";
        assert TextNota3 != null : "fx:id=\"TextNota3\" was not injected: check your FXML file 'principal_view.fxml'.";

    }

}