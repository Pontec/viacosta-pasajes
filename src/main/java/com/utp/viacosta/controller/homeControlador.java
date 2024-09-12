package com.utp.viacosta.controller;

import com.utp.viacosta.util.FxmlCargarUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class homeControlador implements Initializable {

    @FXML
    private BorderPane borderPane;

    @FXML
    private AnchorPane pane_inicio;

    @FXML
    private Button btn_clientes;

    @FXML
    private Button btn_empleados;

    @FXML
    private Button btn_facturacion;

    @FXML
    private Button btn_inicio;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    void btnClientes(ActionEvent event) throws IOException {
        Parent vista = FxmlCargarUtil.load("/view/clientesview.fxml");
        borderPane.setCenter(vista);
        //AnchorPane vista = FXMLLoader.load(getClass().getResource("/view/clientesview.fxml"));
        //borderPane.setCenter(vista);
    }

    @FXML
    void btnEmpleados(ActionEvent event) throws IOException {
        Parent vista = FxmlCargarUtil.load("/view/empleadosview.fxml");
        borderPane.setCenter(vista);
        //Parent  vista = FXMLLoader.load(getClass().getResource("/view/empleadosview.fxml"));
        //borderPane.setCenter(vista);
    }

    @FXML
    void btnFacturacion(ActionEvent event) throws IOException {
        Parent vista = FxmlCargarUtil.load("/view/facturacionView.fxml");
        borderPane.setCenter(vista);
        //AnchorPane vista = FXMLLoader.load(getClass().getResource("/view/facturacionView.fxml"));
        //borderPane.setCenter(vista);

    }

    @FXML
    void btnInicio(ActionEvent event) throws IOException {
        pane_inicio.toFront();

    }

}
