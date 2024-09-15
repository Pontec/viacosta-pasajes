package com.utp.viacosta.controller;

import com.utp.viacosta.model.EmpleadoModel;
import com.utp.viacosta.service.EmpleadoService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class empleadosControlador implements Initializable {

    @Autowired
    private EmpleadoService empleadoService;

    @FXML
    private Button btn_actualizar;

    @FXML
    private Button btn_eliminar;

    @FXML
    private Button btn_guardar;

    @FXML
    private ComboBox<?> cbox_rol;

    @FXML
    private TextField txt_contraseña;

    //@FXML
    //private TableView<EmpleadoModel> tabla_empleados;

    @FXML
    private ListView<EmpleadoModel> tabla_empleados;


    @FXML
    private TextField txt_apellido;

    @FXML
    private TextField txt_correo;

    @FXML
    private TextField txt_dni;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_telefono;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listarEmpleados();
    }


    @FXML
    public void guardarEmpleados(ActionEvent event){
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setDni(txt_dni.getText());
        empleado.setNombre(txt_nombre.getText());
        empleado.setApellido(txt_apellido.getText());
        empleado.setCorreo(txt_correo.getText());
        empleado.setPassword(txt_contraseña.getText());
        empleado.setTelefono(txt_telefono.getText());

        empleadoService.save(empleado);
        clear();
    }

    @FXML
    public void listarEmpleados(){
        tabla_empleados.setItems(FXCollections.observableArrayList(empleadoService.findAll()));

    }

    @FXML
    public void clear(){
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_correo.setText("");
        txt_contraseña.setText("");
        txt_telefono.setText("");

    }




}
