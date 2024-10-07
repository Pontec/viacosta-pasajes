package com.utp.viacosta.controller;

import com.utp.viacosta.model.EmpleadoModel;
import com.utp.viacosta.model.RolModel;
import com.utp.viacosta.service.EmpleadoService;
import com.utp.viacosta.service.RolService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

@Component
public class empleadosControlador implements Initializable {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private RolService rolService;

    @FXML
    private Button btn_actualizar;

    @FXML
    private Button btn_eliminar;

    @FXML
    private Button btn_guardar;

    @FXML
    private ComboBox<RolModel> cbox_rol;

    @FXML
    private TextField txt_contraseña;

    @FXML
    private TableView<EmpleadoModel> tabla_empleados;

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
        cargarRoles();
    }


    @FXML
    private void guardarEmpleados(ActionEvent event){
        EmpleadoModel empleado = new EmpleadoModel();
        empleado.setDni(txt_dni.getText());
        empleado.setNombre(txt_nombre.getText());
        empleado.setApellido(txt_apellido.getText());
        empleado.setCorreo(txt_correo.getText());
        empleado.setPassword(txt_contraseña.getText());
        empleado.setTelefono(txt_telefono.getText());

        RolModel rolSeleccionado = cbox_rol.getValue();  // Obtener el rol seleccionado
        Set<RolModel> roles = new HashSet<>();  // Crear un Set de roles (o lista, dependiendo de tu modelo)
        roles.add(rolSeleccionado);  // Agregar el rol seleccionado al conjunto de roles
        empleado.setRoles(roles);  // Asignar el conjunto de roles al empleado

        empleadoService.save(empleado);
        clear();
    }

    @FXML
    private void listarEmpleados(){
        tabla_empleados.setItems(FXCollections.observableArrayList(empleadoService.findAll()));

        //tabla_empleados.setItems(FXCollections.observableArrayList(empleadoService.findAll()));

    }

    private void cargarRoles(){
        //cbox_rol.setItems(FXCollections.observableArrayList(rolService.findAll()));
        List<RolModel> roles = rolService.findAll();  // Aquí llamas al servicio que te trae todos los roles
        cbox_rol.setItems(FXCollections.observableArrayList(roles));  // Llenas el ComboBox con los roles
    }

    @FXML
    private void deleteEmpleado(ActionEvent event){
        empleadoService.deleteById(empleadoService.findAll().get(0).getId());
        clear();
        listarEmpleados();
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



    //Metodos de apoyo
    //Metodo para mapear las columnas de la tabla
    private void configurarColumnas() {
        tabla_empleados.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tabla_empleados.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tabla_empleados.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("apellido"));
        tabla_empleados.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("dni"));
        tabla_empleados.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("telefono"));
        tabla_empleados.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("correo"));
        tabla_empleados.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("rol")); // Asegúrate de que tu modelo tenga una representación de Rol.
    }



}
