package com.utp.viacosta.controller;

import com.utp.viacosta.model.UsuarioModelo;
import com.utp.viacosta.service.impl.UsuarioServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class usuarioControlador implements Initializable {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @FXML
    private Button btn_ingresar;

    @FXML
    private TextField txt_correo;

    @FXML
    private TextField txt_password;

    @FXML
    void Login(ActionEvent event) throws IOException {
        Login();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    // Método que maneja el inicio de sesión
    private void Login() throws IOException {
        String correo = txt_correo.getText();
        String password = txt_password.getText();

        // Buscar el usuario por correo
        UsuarioModelo usuario = usuarioServiceImpl.findByCorreo(correo);

        if (usuario != null && usuario.getPassword().equals(password)) {
            mostrarAlerta("Inicio de sesión exitoso", "Bienvenido " + usuario.getCorreo(), Alert.AlertType.INFORMATION);
            // Llamar al método para abrir la nueva ventana
            abrirNuevaVentana();

        } else {
            mostrarAlerta("Error de autenticación", "Correo o contraseña incorrectos", Alert.AlertType.ERROR);
        }
    }

    // Método para mostrar alertas en JavaFX
    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    // Método para abrir la nueva ventana o cambiar de escena
    private void abrirNuevaVentana() throws IOException {
        // Cargar el nuevo archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/view/homeView.fxml"));
        
        // Obtener el stage actual desde el botón o la ventana
        Stage stage = (Stage) btn_ingresar.getScene().getWindow();

        // Cambiar la escena
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}