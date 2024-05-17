package org.example.appgestionfct;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.*;

public class Controlador {
    public TextField txtCodEmpresa;
    public TextField txtCif;
    public TextField txtNombre;
    public TextField txtDireccion;
    public TextField txtCodPostal;
    public TextField txtLocalidad;
    public TextField txtJornada;
    public TextField txtModalidad;
    public TextField txtEmail;
    public TextField txtDniResponsable;
    public TextField txtNombreResponsable;
    public TextField txtApellidosResponsable;
    public TextField txtDniTl;
    public TextField txtNombreTl;
    public TextField txtApellidosTl;
    public TextField txtTlfTl;
    public Button botonInsertar;
    public Button botonModificar;
    public Button botonEliminar;
    public Button btnDat;
    public Button btnXml;
    public SplitMenuButton btnTutor;
    public SplitMenuButton btnEmpresa;
    public SplitMenuButton btnAlumno;
    public Button btnContinuar;
    public TableView<Empresa> tablaEmpresa;
    public TableColumn<Empresa, Integer> codEmpresa;
    public TableColumn<Empresa, String> Cif;
    public TableColumn<Empresa, String> nombreEmpresa;
    public TableColumn<Empresa, String> direccion;
    public TableColumn<Empresa, String> codPostal;
    public TableColumn<Empresa, String> localidad;
    public TableColumn<Empresa, Integer> jornada;
    public TableColumn<Empresa, Integer> modalidad;
    public TableColumn email;
    public TableColumn dniResponsable;
    public TableColumn nombreResponsable;
    public TableColumn apellidosResponsable;
    public TableColumn dniTl;
    public TableColumn nombreTl;
    public TableColumn apellidosTl;
    public TableColumn tlfTl;

    public void initialize() {
        DataBase conexion = new DataBase();
        conexion.connectDatabase();
        Empresa empresa = new Empresa();
        ObservableList<Empresa> listaEmpresa = empresa.getEmpresa();
        tablaEmpresa.setItems(listaEmpresa);
    }


    public void funcionInsertar(ActionEvent actionEvent) {

    }

    public void funcionModificar(ActionEvent actionEvent) {
    }

    public void funcionEliminar(ActionEvent actionEvent) {
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