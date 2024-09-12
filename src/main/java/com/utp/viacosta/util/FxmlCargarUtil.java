package com.utp.viacosta.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

public class FxmlCargarUtil {

        private static ApplicationContext springContext;

        // Método para configurar el contexto de Spring
        public static void setApplicationContext(ApplicationContext context) {
            springContext = context;
        }

        // Método utilitario para cargar un archivo FXML y aplicar inyección de dependencias
        public static Parent load(String fxmlPath) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(FxmlCargarUtil.class.getResource(fxmlPath));
            fxmlLoader.setControllerFactory(springContext::getBean);  // Inyección de dependencias con Spring
            return fxmlLoader.load();
        }


}
