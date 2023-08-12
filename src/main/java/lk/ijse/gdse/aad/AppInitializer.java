package lk.ijse.gdse.aad;

import javafx.application.Application;
import javafx.stage.Stage;
import lk.ijse.gdse.aad.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
