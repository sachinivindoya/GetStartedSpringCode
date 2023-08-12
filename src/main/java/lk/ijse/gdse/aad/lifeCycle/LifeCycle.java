package lk.ijse.gdse.aad.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public LifeCycle(){
        System.out.println("Constructor called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set bean Factory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is :" +s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am Ready ............");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
    @PostConstruct
    public void myMethodOne(){

    }

    @PreDestroy
    public void myMethodTwo(){

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Man Yanoooo...!");
    }



}
