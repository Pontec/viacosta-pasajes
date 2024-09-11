package com.utp.viacosta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunViaCosta extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		var context = SpringApplication.run(RunViaCosta.class);
		var fxml = new FXMLLoader(getClass().getResource("/view/usuarioView.fxml"));
		fxml.setControllerFactory(context::getBean); // Para usar beans gestionados por Spring

		var scene = new Scene(fxml.load());
		stage.setTitle("Sistema Pasajes Via Costa");
		stage.setScene(scene);
		stage.show();
	}
}
