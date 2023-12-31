package lk.ijse.gdse.aad.config;

import lk.ijse.gdse.aad.di.*;
import lk.ijse.gdse.aad.lifeCycle.LifeCycle;
import lk.ijse.gdse.aad.sample.MyBean;
import lk.ijse.gdse.aad.sample.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = {LifeCycle.class, Prabash.class, Nuwangi.class, Chanchala.class, Christeen.class, Hansi.class})
public class ApplicationConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    public MyComponent myComponent(){
        return new MyComponent();
    }
}
