package lk.ijse.gdse.aad;

import javafx.application.Application;
import javafx.stage.Stage;
import lk.ijse.gdse.aad.config.ApplicationConfig;
import lk.ijse.gdse.aad.lifeCycle.LifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
       // LifeCycle lifeCycle = (LifeCycle) ctx.getBean("lifeCycle");
       // System.out.println("Get bean name :" + lifeCycle);
        ctx.registerShutdownHook();
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
