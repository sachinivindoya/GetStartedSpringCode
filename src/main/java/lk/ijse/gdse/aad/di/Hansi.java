package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long Hair")
@PureLove
public class Hansi implements Love{
    @Override
    public void kiss() {
        System.out.println("ummmmmmmmmmmmmma");
        System.out.println("ummmmmmmmmmmmmma");
        System.out.println("ummmmmmmmmmmmmma");
        System.out.println("ummmmmmmmmmmmmma");
        System.out.println("ummmmmmmmmmmmmma");
    }
}
