package org.example.appgestionfct;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
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
    public TableView tablaEmpresa;
    public TableColumn colCodEmpresa;
    public TableColumn colCif;
    public TableColumn colNombreEmpresa;
    public TableColumn colDireccion;
    public TableColumn colCodPostal;
    public TableColumn colLocalidad;
    public TableColumn colJornada;
    public TableColumn colModalidad;
    public TableColumn colEmail;
    public TableColumn colDniResponsable;
    public TableColumn colNombreResponsable;
    public TableColumn colApellidosResponsable;
    public TableColumn colDniTl;
    public TableColumn colNombreTl;
    public TableColumn colApellidosTl;
    public TableColumn colTlfTl;
    public Button btnDat;
    public Button btnXml;
    public ComboBox selectorAlumnos;
    public ComboBox selectorEmpresa;
    public ComboBox selectorTutor;
    public Button btnContinuar;

    private Alumno alumnoSeleccionado;
    private Tutor tutorSeleccionado;
    private Empresa empresaSeleccionada;

    public void initialize() {
        // Cargar los datos en la TableView al inicializar
        try {
            Connection connection = DataBase.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM empresa");
            ResultSet resultSet = statement.executeQuery();
            ObservableList<Empresa> empresas = ObtencionDeDatos(resultSet);

            configurarTabla();

            tablaEmpresa.setItems(empresas);
            resultSet.close();
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void configurarTabla() {
        colCodEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa, Integer>("codEmpresa"));
        colCif.setCellValueFactory(new PropertyValueFactory<Empresa, String>("cif"));
        colNombreEmpresa.setCellValueFactory(new PropertyValueFactory<Empresa, String>("nombreEmpresa"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<Empresa, String>("direccion"));
        colCodPostal.setCellValueFactory(new PropertyValueFactory<Empresa, String>("codPostal"));
        colLocalidad.setCellValueFactory(new PropertyValueFactory<Empresa, String>("localidad"));
        colJornada.setCellValueFactory(new PropertyValueFactory<Empresa, Integer>("jornada"));
        colModalidad.setCellValueFactory(new PropertyValueFactory<Empresa, Integer>("modalidad"));
        colEmail.setCellValueFactory(new PropertyValueFactory<Empresa, String>("email"));
        colDniResponsable.setCellValueFactory(new PropertyValueFactory<Empresa, String>("dniResponsable"));
        colNombreResponsable.setCellValueFactory(new PropertyValueFactory<Empresa, String>("nombreResponsable"));
        colApellidosResponsable.setCellValueFactory(new PropertyValueFactory<Empresa, String>("apellidosResponsable"));
        colDniTl.setCellValueFactory(new PropertyValueFactory<Empresa, String>("dniTl"));
        colNombreTl.setCellValueFactory(new PropertyValueFactory<Empresa, String>("nombreTl"));
        colApellidosTl.setCellValueFactory(new PropertyValueFactory<Empresa, String>("apellidosTl"));
        colTlfTl.setCellValueFactory(new PropertyValueFactory<Empresa, String>("tlfTl"));
    }

    private ObservableList<Empresa> ObtencionDeDatos(ResultSet resultSet) throws SQLException {
        ObservableList<Empresa> empresas = FXCollections.observableArrayList();

        while (resultSet.next()) {
            String nombreEmpresa = resultSet.getString("nombre");
            String cif = resultSet.getString("cif");
            Integer codEmpresa = resultSet.getInt("cod_empresa");
            String direccion = resultSet.getString("direccion");
            String codPostal = resultSet.getString("cod_postal");
            String localidad = resultSet.getString("localidad");
            Integer jornada = resultSet.getInt("tipo_jornada");
            Integer modalidad = resultSet.getInt("modalidad");
            String email = resultSet.getString("email");
            String dniResponsable = resultSet.getString("dni_responsable");
            String nombreResponsable = resultSet.getString("nombre_responsable");
            String apellidosResponsable = resultSet.getString("apellidos_responsable");
            String dniTl = resultSet.getString("dni_tutor_legal");
            String nombreTl = resultSet.getString("nombre_tutor_legal");
            String apellidosTl = resultSet.getString("apellidos_tutor_legal");
            String tlfTl = resultSet.getString("tlf_tutor_legal");

            Empresa empresa = new Empresa(codEmpresa, cif, nombreEmpresa, direccion, codPostal, localidad, jornada, modalidad, email, dniResponsable, nombreResponsable, apellidosResponsable, dniTl, nombreTl, apellidosTl, tlfTl);
            empresas.add(empresa);
        }
        return empresas;
    }

    public void funcionInsertar(ActionEvent actionEvent) {
        try {
            Connection connection = DataBase.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO empresa (cod_empresa, nombre, direccion, cif, cod_postal, localidad, tipo_jornada, modalidad, email, dni_responsable, nombre_responsable, apellidos_responsable, dni_tutor_legal, nombre_tutor_legal, apellidos_tutor_legal, tlf_tutor_legal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            statement.setInt(1, Integer.parseInt(txtCodEmpresa.getText()));
            statement.setString(2, txtNombre.getText());
            statement.setString(3, txtDireccion.getText());
            statement.setString(4, txtCif.getText());
            statement.setString(5, txtCodPostal.getText());
            statement.setString(6, txtLocalidad.getText());
            statement.setInt(7, Integer.parseInt(txtJornada.getText()));
            statement.setInt(8, Integer.parseInt(txtModalidad.getText()));
            statement.setString(9, txtEmail.getText());
            statement.setString(10, txtDniResponsable.getText());
            statement.setString(11, txtNombreResponsable.getText());
            statement.setString(12, txtApellidosResponsable.getText());
            statement.setString(13, txtDniTl.getText());
            statement.setString(14, txtNombreTl.getText());
            statement.setString(15, txtApellidosTl.getText());
            statement.setString(16, txtTlfTl.getText());

            statement.executeUpdate();
            statement.close();
            connection.close();

            // Actualizar la tablaEmpresa
            initialize();


        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void funcionModificar(ActionEvent actionEvent) {
        try{
            Connection conexion = DataBase.getConnection();
            PreparedStatement statement;

            if (empresaSeleccionada != null){
                statement = conexion.prepareStatement("UPDATE empresa SET cod_empresa = ?, nombre = ?, direccion = ?, cif = ?, cod_postal = ?, localidad = ?, tipo_jornada = ?, modalidad = ?, email = ?, dni_responsable = ?, nombre_responsable = ?, apellidos_responsable = ?, dni_tutor_legal = ?, nombre_tutor_legal = ?, apellidos_tutor_legal = ?, tlf_tutor_legal = ? WHERE cod_empresa = ?");

                statement.setInt(1, Integer.parseInt(txtCodEmpresa.getText()));
                statement.setString(2, txtNombre.getText());
                statement.setString(3, txtDireccion.getText());
                statement.setString(4, txtCif.getText());
                statement.setString(5, txtCodPostal.getText());
                statement.setString(6, txtLocalidad.getText());
                statement.setInt(7, Integer.parseInt(txtJornada.getText()));
                statement.setInt(8, Integer.parseInt(txtModalidad.getText()));
                statement.setString(9, txtEmail.getText());
                statement.setString(10, txtDniResponsable.getText());
                statement.setString(11, txtNombreResponsable.getText());
                statement.setString(12, txtApellidosResponsable.getText());
                statement.setString(13, txtDniTl.getText());
                statement.setString(14, txtNombreTl.getText());
                statement.setString(15, txtApellidosTl.getText());
                statement.setString(16, txtTlfTl.getText());
                statement.setInt(17, empresaSeleccionada.getCodEmpresa());

                statement.executeUpdate();
                statement.close();

                // Actualizar la tablaEmpresa
                initialize();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void funcionEliminar(ActionEvent actionEvent) {
        try {
            Connection connection = DataBase.getConnection();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM empresa WHERE cod_empresa = ?");
            statement.setInt(1, empresaSeleccionada.getCodEmpresa());
            statement.executeUpdate();
            statement.close();
            connection.close();

            // Actualizar la tablaEmpresa
            initialize();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void seleccionar(MouseEvent mouseEvent) {
        // Selecciona el objeto de la tabla
        empresaSeleccionada = (Empresa) this.tablaEmpresa.getSelectionModel().getSelectedItem();

        // Muestra los datos en los campos de texto
        if (empresaSeleccionada != null) {
            this.txtCodEmpresa.setText(String.valueOf(empresaSeleccionada.getCodEmpresa()));
            this.txtCif.setText(empresaSeleccionada.getCif());
            this.txtNombre.setText(empresaSeleccionada.getNombreEmpresa());
            this.txtDireccion.setText(empresaSeleccionada.getDireccion());
            this.txtCodPostal.setText(empresaSeleccionada.getCodPostal());
            this.txtLocalidad.setText(empresaSeleccionada.getLocalidad());
            this.txtJornada.setText(String.valueOf(empresaSeleccionada.getJornada()));
            this.txtModalidad.setText(String.valueOf(empresaSeleccionada.getModalidad()));
            this.txtEmail.setText(empresaSeleccionada.getEmail());
            this.txtDniResponsable.setText(empresaSeleccionada.getDniResponsable());
            this.txtNombreResponsable.setText(empresaSeleccionada.getNombreResponsable());
            this.txtApellidosResponsable.setText(empresaSeleccionada.getApellidosResponsable());
            this.txtDniTl.setText(empresaSeleccionada.getDniTl());
            this.txtNombreTl.setText(empresaSeleccionada.getNombreTl());
            this.txtApellidosTl.setText(empresaSeleccionada.getApellidosTl());
            this.txtTlfTl.setText(empresaSeleccionada.getTlfTl());
        }
    }

    public void insertarDat(ActionEvent actionEvent) {
    }

    public void insertarXml(ActionEvent actionEvent) {
    }

    public void continuarAsignacion(ActionEvent actionEvent) {
    }
}