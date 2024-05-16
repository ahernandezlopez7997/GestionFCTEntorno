package org.example.appgestionfct;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class Controlador {
    public TextField empresa;
    public TextField cif;
    public TextField nombre;
    public TextField direccion;
    public TextField cod_postal;
    public TextField localidad;
    public TextField jornada;
    public TextField modalidad;
    public TextField email;
    public TextField dniResponsable;
    public TextField nombreResponsable;
    public TextField nombre_tl;
    public TextField dni_tl;
    public TextField apellidos_responsable;
    public TextField apellidos_tl;
    public TextField tlf_tl;
    public Button boton_insertar;
    public Button boton_modificar;
    public Button boton_eliminar;
    public Button btnDat;
    public Button btnXml;
    public SplitMenuButton btnTutor;
    public SplitMenuButton btnEmpresa;
    public SplitMenuButton btnAlumno;
    public Button btnContinuar;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void función_Insertar(ActionEvent actionEvent) {
    }

    public void funcion_modificar(ActionEvent actionEvent) {
    }

    public void funcion_eliminar(ActionEvent actionEvent) {
    }

    public void insertarDat(ActionEvent actionEvent) {
    }

    public void insertarXml(ActionEvent actionEvent) {
    }

    public void seleccionTutor(ActionEvent actionEvent) {
    }

    public void seleccionEmpresa(ActionEvent actionEvent) {
    }

    public void seleccionAlumno(ActionEvent actionEvent) {
    }

    public void continuarAsignacion(ActionEvent actionEvent) {
    }
}