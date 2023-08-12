package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier // meta annotate
@Retention(RetentionPolicy.RUNTIME)
public @interface PureLove {

}
