package lk.ijse.gdse.aad.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Nuwangi implements Love{

    @Override
    public void kiss() {
        System.out.println("french kiss");
        System.out.println("french kiss");
    }
}
